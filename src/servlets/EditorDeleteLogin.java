package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditorDeleteLogin")
public class EditorDeleteLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter();
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor=DarkTurquoise>");
		out.println("<h2>Edit or Delete Username</h2><hr>");
		
		out.println("<form action=UpdateLogin> <h2>");
		out.println("Username <input type=text name=u1 size=30><br>");
		out.println("New Password <input type=text name=u2 size=30><br>");
		out.println("<input type=submit value=ChangePassword>");
		out.println("</form>");
		
		out.println("<form action=LoginDeleted> <h2>");
		out.println("Username <input type=text name=u1 size=30><br>");
		out.println("<input type=submit value=DeleteLogin>");
		out.println("</form></html>");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
