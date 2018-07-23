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

import jdbc.*;


@WebServlet("/UserDeleted")
public class UserDeleted extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<h2>Employee Deleted</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String s1=request.getParameter("t1");
		
		
		session.setAttribute("Employee Number", s1);
		
	
		
		/*Enumeration<String> names=session.getAttributeNames();
		while(names.hasMoreElements()) {
			String name=names.nextElement();
			String value=session.getAttribute(name).toString();
			out.println(name+" - "+value+"<br>");
		}
		
		*/
		
		
		 
		try {
		Integer n1=Integer.parseInt(s1);
		System.out.println(n1);
			DAO dao = new EmployeeDAO();
			dao.deleteEmp(n1);
			System.out.println("DB Deleted");
			out.println("Employee Deleted");
		} catch (Exception e) {
			System.err.println("block  failed");
			out.println("Error:Enter existing Employee ID");
			out.println("<form action=DeleteEmp> <h2>");
			out.println("<input type=submit value=GoBack>");
			out.println("</form>");
			
		}
		out.println("</html>");
		
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
