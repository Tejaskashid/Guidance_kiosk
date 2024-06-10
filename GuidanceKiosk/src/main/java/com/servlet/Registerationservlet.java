package com.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Userbean;
import com.connection.DbConnection;
import com.services.Userservices;

/**
 * Servlet implementation class Registerationservlet
 */
@WebServlet("/userregisteration")
public class Registerationservlet extends HttpServlet { 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String msg="";
		if(email !=null && password !=null){
			Userbean user =new Userbean(fname,lname,age,email,password);
			Userservices registerservice= new Userservices();
			msg=registerservice.isregister(user);
		}else {
			msg="please enter email and password";
		}
		/*request.setAttribute("message", msg);
		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp?message=" + msg);

		rd.forward(request, response);*/
		
		String redirectURL = "Registration.jsp?message=" + msg;
	    response.sendRedirect(redirectURL);
		
		
		
	}

}
