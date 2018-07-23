package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO implements DAOLoginInterface{
	//public static void main(String[] args) throws Exception {
	private Statement st=null;
	public LoginDAO() throws Exception {
	  Connection con=LoginDBConnection.getConnection();
	  st=con.createStatement();
	
	}	
	
	@Override
	public void saveLogin(LoginUser info) throws Exception {
		String sql="insert into userlogin values('"+info.getUsername()+"'"+",'"+info.getPassword()+"')";//mysql
		int n=st.executeUpdate(sql);//mysql
		if(n>0) {//mysql
		System.out.println("User saved:"+n);//mysql
		}	
		
	}

	@Override
	public void updateLogin(LoginUser info) throws Exception {
			String sql="update userlogin set user="+"'"+info.getUsername()+"', password='"+info.getPassword()+"' where user='"+info.getUsername()+"'";//mysql
			int n=st.executeUpdate(sql);//mysql
			
			if(n>0) {//mysql
				System.out.println("Username updated:"+n);//mysql
			}
			else
			{
				System.out.println( "No Updations!");
			}
		
	}

	public void deleteLogin(String uname) throws Exception {
		String sql="delete from userlogin where user='"+uname+"'";//mysql
		int n=st.executeUpdate(sql);                 //mysql
		if(n>0) {                                  //mysql
		System.out.println("Username deleted:"+n);//mysql
		}
		else{
			System.out.println( "No matching!");
		}
		
	}

	@Override
	public int selectLogin(LoginUser info) throws Exception {
		String sql="SELECT user,password from userlogin where user= '" + info.getUsername() + "' and password= '"+info.getPassword()+"'";
		ResultSet rs=st.executeQuery(sql);  
		String username = null, password = null;
		int n=0;
		while (rs.next()) {
			username= rs.getString("user");
			 password= rs.getString("password");
		}
		
	
		if((username.isEmpty()) ||(password.isEmpty())) {
			n=0;
		}
			else{
				n=1;
			}
		return n;
			
	}

}
