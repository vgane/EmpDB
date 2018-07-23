package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

//implements methods in DAO:Data access object
//DTO:Data Transfer object
public class EmployeeDAO implements DAO{

	private Statement st=null;
	public EmployeeDAO() throws Exception {
	  Connection con=ConnectionFactory.getConnection();
		st=con.createStatement();
	
	}
	@Override
	public void saveEmp(Employee emp) throws Exception {
		String sql="insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";//mysql
		int n=st.executeUpdate(sql);//mysql
		
		if(n>0) {//mysql
		System.out.println("Employee saved:"+n);//mysql
		}	
	/*	oracle database query: String sql="insert into emps values(? , ?, ?)";
	try {
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setInt(1, emp.getEmpno());
		 stmt.setString(2, emp.getEname());
		 stmt.setFloat(3, emp.getSal());
		 System.out.println("Employee Saved");
	} catch(Exception e)
	{
		 System.out.println("failed");
		e.printStackTrace();
	}*/
		 
		
	}
	

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql="update emp set ename='"+emp.getEname()+"', sal="+emp.getSal()+" where empno="+emp.getEmpno();//mysql
		int n=st.executeUpdate(sql);//mysql
		
		if(n>0) {//mysql
			System.out.println("Employee updated:"+n);//mysql
		}
		else
		{
			System.out.println( "No Updations!");
		}
	
		/*	try {
		}
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setFloat(1, emp.getSal());
		 stmt.setInt(2, emp.getEmpno());
		int n=stmt.executeUpdate();
		System.out.println("exceuted");
		System.out.println("Employee updated");
		} catch(Exception e)
		{
			 System.out.println("failed to update");
			e.printStackTrace();
		}
		
	}*/
	}

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql="delete from emp where empno="+eno;//mysql
		int n=st.executeUpdate(sql);                 //mysql
		if(n>0) {                                  //mysql
		System.out.println("Employee deleted:"+n);//mysql
		}
		else{
			System.out.println( "No matching!");
		}
		/*oracle: String sql="delete from emps where empno=?";
		try {
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setInt(1, eno);
		int n=stmt.executeUpdate();
		System.out.println("Employee Deleted");
		}catch (Exception e)
		{
			 System.out.println("failed to delete");
			e.printStackTrace();
		}
*/		
	}

}