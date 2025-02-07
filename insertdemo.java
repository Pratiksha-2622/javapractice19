package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertdemo {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rohit@10#avtfh&10");
	
		PreparedStatement ps=connection.prepareStatement("insert into emp values(?,?,?,?)");
		ps.setInt(1, 102);
		ps.setString(2, "Pratiksha");
		ps.setInt(3, 20000);
		ps.setString(4, "Kolhapur");
		
		int update=ps.executeUpdate();
		System.out.println(update);
		connection.close();
	}

}
