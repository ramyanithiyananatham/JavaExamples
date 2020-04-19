package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DBDataPrepareStmtInsertRead {
//prepareStatement() creates a PreparedStatement Object out of a parameterized SQL String. 
	public static void main(String[] args) {

		String SQL_SELECT = "Select * from EMPLOYEE";
		
		// auto close connection and preparedStatement
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"mani4YOU");
			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

			String queryInsert = " insert into EMPLOYEE (id,name,salary)" + " values (?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(queryInsert);
			preparedStmt.setInt(1, 21);
			preparedStmt.setString(2, "ratish");
			preparedStmt.setInt(3, 2000);
			preparedStmt.execute();
			
			PreparedStatement preparedStatement = con.prepareStatement(SQL_SELECT);
			{
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					int id = resultSet.getInt("ID");
					String name = resultSet.getString("NAME");
					int salary = resultSet.getInt("SALARY");
					Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");
					System.out.println("id:" + id + " Name:" + name + " Salary:" + salary + " Timestamp:" + createdDate);
				}
				con.close();
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
