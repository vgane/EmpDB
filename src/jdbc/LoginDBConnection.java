package jdbc;
import java.sql.Connection;
	import java.sql.DriverManager;

public class LoginDBConnection {
	//connection to Login database

		public static Connection getConnection() {
		Connection con=null;
			if(con==null) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				 con= DriverManager.getConnection("jdbc:mysql://localhost/eduproject?autoReconnect=true&useSSL=false","root","password");
					
				}catch(Exception e) {
					System.out.println(e);
					
				}
		}
			return con;
		}
	}

