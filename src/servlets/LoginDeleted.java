package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.DAO;
import jdbc.DAOLoginInterface;
import jdbc.Employee;
import jdbc.EmployeeDAO;
import jdbc.LoginDAO;
import jdbc.LoginUser;


@WebServlet("/LoginDeleted")
public class LoginDeleted extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<h2>Deleting Login</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String p1=request.getParameter("u1");
	
	
		
		
		session.setAttribute("Username", p1);
	
		
		try {
			
		String x1=String.valueOf(p1);
		System.out.println(x1);
		out.println("User "+x1+" Deleted");

		DAOLoginInterface dao2=new LoginDAO();
		dao2.deleteLogin(x1);
		System.out.println("DB Login deleted");
		} catch (Exception e) {
			System.err.println("block  failed");
			 out.println("Error:Enter word, word");
				out.println("<form action=admin> <h2>");
				out.println("<input type=submit value=GoBack>");
				out.println("</form></html>");
			
			/*out.println("Error:Enter word, word");
			out.println("<form action=CreateUser1> <h2>");
			out.println("<input type=submit value=GoBack>");
			out.println("</form></html>");*/
		}
		
		out.println("<html>");
		out.println("<form action=login.html> <h2>");
		out.println("<input type=submit value=LOGOUT>");
		out.println("</form></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
