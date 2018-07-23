package servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.DAO;
import jdbc.DAOLoginInterface;
import jdbc.Employee;
import jdbc.EmployeeDAO;
import jdbc.LoginDAO;
import jdbc.LoginUser;

import java.io.*;

@WebServlet("/admin")

	public class AdminServlet extends HttpServlet {



		public void service (HttpServletRequest request, HttpServletResponse response) throws IOException {

			response.setContentType("text/html");
			//response.setHeader("Refresh", "40");
			PrintWriter out = response.getWriter();
			HttpSession session=request.getSession();
			
			out.println("<html><body bgcolor=#5a1641 text=white>");
			out.println("Hello, "+request.getParameter("uid"));
			
			
			String p1=request.getParameter("uid");
			String p2=request.getParameter("pwd");
		

			
			session.setAttribute("Username", p1);
			session.setAttribute("Password", p2);
			
			try {
				String x1=String.valueOf(p1);
				String x2=String.valueOf(p2);
				System.out.println(x1+" "+x2);
				out.println("User "+x1+" created");
				DAOLoginInterface dao2=new LoginDAO();
				LoginUser info=new LoginUser(x1,x2);
				int n=dao2.selectLogin(info);
				if(n==0) {    
					throw new Exception();
					
			}		
			} catch (Exception e) {
				
				response.sendRedirect(request.getContextPath() + "/login.html");
				out.println("<script>document.getElementById('error').innerHTML='Sorry UserName or Password'; </script>");
				System.err.println("block  failed");
			}
			
			
			
			

			
		

			out.println("<form action=EditorDeleteLogin> <h2>");
			out.println("<input type=submit value=EditLoginInfo>");
			out.println("</form>");
			out.println("<hr>");
			
		
			
			
			out.println("<form action=SaveEmp> <h2>");
			out.println("<input type=submit value=CreateUser>");
			out.println("</form>");
			out.println("<hr>");
			
			out.println("<form action=UpdateEmp> <h2>");
			out.println("<input type=submit value=UpdateUser>");
			out.println("</form>");
			out.println("<hr>");
		
			out.println("<form action=DeleteEmp> <h2>");
			out.println("<input type=submit value=DeleteUser>");
			out.println("</form>");
			
			out.println("<hr></body></html>");
		}


}
