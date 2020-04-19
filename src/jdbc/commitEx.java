package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class commitEx {
	 public static void main(String[] args) throws Exception {
	     Connection con = DriverManager.getConnection (
	    		  "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"mani4YOU");
	      Statement stmt = con.createStatement();
	      String query = "insert into employee values(65,'sweta',1234)";
	      String query1 ="insert into employee values(66,'papia',3456)";
	      String query2 = "select * from employee";
	      
	      ResultSet rs = stmt.executeQuery(query2);
	      int no_of_rows = 0;
	      
	      while (rs.next()) {
	         no_of_rows++;
	      }
	      System.out.println("No. of rows before commit statement = "+ no_of_rows);
	      con.setAutoCommit(false);
	      stmt.execute(query1);
	      stmt.execute(query);
	      con.commit();
	      rs = stmt.executeQuery(query2);
	      no_of_rows = 0;
	      
	      while (rs.next()) {
	         no_of_rows++;
	      }
	      System.out.println("No. of rows after commit statement = "+ no_of_rows);
	      con.close();
	   }
}
