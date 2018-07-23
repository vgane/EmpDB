package jdbc;

import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) throws Exception {
		/*DAO dao=new EmployeeDAO();
		Employee emp=new Employee(220,"Ami", 345.55f);
		dao.saveEmp(emp);
		*/
		
		//update Employee
		//Employee emp=new Employee(107,"Ambili", 345.56f);
		//	dao.updateEmp(emp);
		
		
		
		/* delete employee int eno=107;
		dao.deleteEmp(eno);
		*/
	/*DAOLoginInterface dao2=new LoginDAO();
	LoginUser info=new LoginUser("amit","password");
	dao2.saveLogin(info);
		DAOLoginInterface dao2=new LoginDAO();
		LoginUser info=new LoginUser("amit","pass");
		dao2.updateLogin(info);
		
		DAOLoginInterface dao2=new LoginDAO();
		dao2.deleteLogin("amit");*/
		
		
	
			DAOLoginInterface dao2=new LoginDAO();
		LoginUser info=new LoginUser("amit","pass");
		int n=dao2.selectLogin(info);;
			System.out.println(n);
			

	}		
	

	}


                                 