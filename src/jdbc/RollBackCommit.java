package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class RollBackCommit {
	public static void main(String[] args) throws Exception {
	      Connection con = DriverManager.getConnection(
	    		  "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"mani4YOU");
	      
	      Statement stmt = con.createStatement();
	      String query1 = "insert into employee values(26,'name',1234)";
	      String query2 = "select * from employee";
	      
	      con.setAutoCommit(false);
	      ResultSet rs = stmt.executeQuery(query2);
	      int no_of_rows = 0;
	      
	      while (rs.next()) {
	         no_of_rows++;
	      }
	      System.out.println("No. of rows before commit statement = "+ no_of_rows);
	      Savepoint spt1 = con.setSavepoint("svpt1");
	      stmt.execute(query1);
	      rs = stmt.executeQuery(query2);
	       no_of_rows = 0;
	      
	      while (rs.next()) {
	         no_of_rows++;
	      }
	      System.out.println("rows after commit and before rollback statement = " + no_of_rows);
	      con.rollback(spt1);
	      con.commit();
	      no_of_rows = 0;
	      rs = stmt.executeQuery(query2);
	      
	      while (rs.next()) {
	         no_of_rows++;
	      }
	      System.out.println("rows after rollback statement = " + no_of_rows);
	   }
}
