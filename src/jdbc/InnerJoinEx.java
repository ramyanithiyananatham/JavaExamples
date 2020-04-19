package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InnerJoinEx {
		   public static void main(String[] args) throws Exception {
		//      Class.forName("org.apache.derby.jdbc.ClientDriver");
		      Connection con = DriverManager.getConnection (
		    		  "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
						"mani4YOU");
		      
		      Statement stmt = con.createStatement();
		      String query ="SELECT student.name, phone, salary, id from student inner join employee on student.name = employee.name";
		      ResultSet rs = stmt.executeQuery(query);
		      System.out.println("id, name, salary");
		      
		      while (rs.next()) {
		    	//   System.out.println("while");
		         String name = rs.getString("name");
		        int phone = rs.getInt("phone");
		        int salary=rs.getInt("salary");
		          int id = rs.getInt("id");
		           System.out.println( "  " + name+"  "+id+"  "+salary+" "+phone);
		      }
		   
		      System.out.println();
		   }
		}