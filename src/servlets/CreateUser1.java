package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateUser1")
public class CreateUser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			//response.setHeader("Refresh", "40");
			response.getWriter();
			PrintWriter out=response.getWriter();
			out.println("<body bgcolor=Purple>");
			out.println("<h2>Enter new User Info</h2><hr>");
			out.println("<form action=CreateLogin> <h2>");
			

			out.println("Username <input type=text name=u1 size=30><br>");
			out.println("Password <input type=text name=u2 size=30><br>");
			out.println("<input type=submit value=SUBMIT>");
			out.println("</form></html>");
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
