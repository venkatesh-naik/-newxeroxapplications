import java.sql.*;
import java.sql.Connection;


public class st {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		String query="insert into jdbc.student values(3,'venk','mech')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded suessfuly");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=root");
			System.out.println("conneciton establised");
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("update");
			

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
