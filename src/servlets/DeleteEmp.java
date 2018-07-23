package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter();
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		out.println("<body bgcolor=SteelBlue>");
		out.println("<h2>Enter User number to delete</h2><hr>");
		out.println("<html>");
		out.println("<form action=UserDeleted> <h2>");
		out.println("Employee Number <input type=text name=t1 size=30><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("<form action=admin> <h2>");
		out.println("<input type=submit value=HOME>");
		out.println("</form></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
