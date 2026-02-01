package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome to Register</h2>");
		
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		
		if(cond!= null) {
		if(cond.equals("checked")) {
			out.println("<h2>Name : " + name + "</h2>");
			out.println("<h2> Password : " + name + "</h2>");
			out.println("<h2> Email : " + email + "</h2>");
			out.println("<h2> Gender : " + gender + "</h2>");
			out.println("<h2> Course : " + course + "</h2>");
			
//			saved to db
//			...
			RequestDispatcher rd = req.getRequestDispatcher("/success");
			rd.forward(req, resp);
			return;
			
		} else {
			out.println("<h2>You have not accepted terms and conditions</h2>");
		}
		}else {
			out.println("<h2>You have not accepted terms and conditions</h2>");	
			
//			object of request dispatcher
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
		}
	}

}



 