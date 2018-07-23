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






@WebServlet("/SaveEmp")
public class SaveEmp extends HttpServlet {
private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		response.getWriter();
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor=DarkTurquoise>");
		out.println("<h2>Enter new User Info</h2><hr>");
		out.println("<form action=UserCreated> <h2>");

		out.println("Employee Number <input type=text name=t1 size=30><br>");
		out.println("Name <input type=text name=t2 size=30><br>");
		out.println("Salary earned <input type=text name=t3 size=30><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	}

}
