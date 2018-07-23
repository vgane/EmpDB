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


@WebServlet("/UpdateLogin")
public class UpdateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<h2>Creating Login</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String p1=request.getParameter("u1");
		String p2=request.getParameter("u2");
	
		
		
		session.setAttribute("Username", p1);
		session.setAttribute("Password", p2);
		
		try {
			
		String x1=String.valueOf(p1);
		String x2=String.valueOf(p2);
		System.out.println(x1+" "+x2);
		out.println("Login "+x1+" updated");

		DAOLoginInterface dao2=new LoginDAO();
		LoginUser info=new LoginUser(x1,x2);
		dao2.updateLogin(info);
		System.out.println("DB saved");
		} catch (Exception e) {
			System.err.println("block  failed");
			 out.println("Error:Enter word, word");
				out.println("<form action=CreateUser1> <h2>");
				out.println("<input type=submit value=GoBack>");
				out.println("</form></html>");
			
			/*out.println("Error:Enter word, word");
			out.println("<form action=CreateUser1> <h2>");
			out.println("<input type=submit value=GoBack>");
			out.println("</form></html>");*/
		}
		
		out.println("<html>");
		out.println("<form action=admin> <h2>");
		out.println("<input type=submit value=HOME>");
		out.println("</form></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
