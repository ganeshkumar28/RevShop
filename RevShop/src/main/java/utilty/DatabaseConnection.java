package utilty;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	private static Connection con;
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Revshop","root","1234");
		return con;
	}
}
