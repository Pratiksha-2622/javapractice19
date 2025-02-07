package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getdata {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","pratiksha@123");
	 
		String query="select * from emp";
		PreparedStatement ps=connection.prepareStatement(query);
		ResultSet set=ps.executeQuery();
		
		while(set.next())
		{
			System.out.println(set.getInt("id"));
			System.out.println(set.getString("Ename"));
			System.out.println(set.getInt("salary"));
			System.out.println(set.getString("city"));
		}
		connection.close();
}
}
