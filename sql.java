import java.sql.*;

public class DBConnect {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection connection =   
          DriverManager.getConnection("jdbc:mysql://localhost:3306/test",  
         "root","");
			System.out.println("Connection Established" + 
          connection);				
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
