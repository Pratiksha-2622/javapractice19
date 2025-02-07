package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertdata {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","pratiksha@123");
		String query="insert into emp values(101,'pratiksha',20000,'kolhapur')";
				
		Statement stmt=connection.createStatement();
		int update=stmt.executeUpdate(query);
		System.out.println(update);
		connection.close();
	}

}
