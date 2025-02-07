package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deletedata 
{
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","pratiksha@123");
	 
		String query="delete from emp  where id=1";
		PreparedStatement ps=connection.prepareStatement(query);
	   
	    int executeUpdate= ps.executeUpdate();
	    System.out.println(executeUpdate);
	    connection.close();
}
}
