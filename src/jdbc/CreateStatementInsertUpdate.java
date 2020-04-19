package jdbc;
import java.sql.*;  
public class CreateStatementInsertUpdate {
	//With the createStatement the underlying database has to parse and compile the passed select query every time the statement is executed.
	public static void main(String args[]){  
	try{  
	//Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
			"jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "mani4YOU");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	//ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.
	ResultSet rs=stmt.executeQuery("select * from employee");  
	//rs.absolute(3); ////getting the record of 3rd row  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	//stmt.executeUpdate("insert into employee values(33,'Irfan',50000)");  
	int result=stmt.executeUpdate("update employee set name='Vimal',salary=10000 where id=33");  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}  

