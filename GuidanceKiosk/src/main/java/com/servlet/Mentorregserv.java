package com.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.beans.Mentorbean;
import com.connection.DbConnection;
import com.mysql.cj.jdbc.Blob;
import com.services.Mentorservices;

@WebServlet("/Mentorregserv")
@MultipartConfig(maxFileSize = 16177215)

public class Mentorregserv extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String mentoremail=request.getParameter("email");
		String mentorpassword=request.getParameter("password");
		String jobtitle=request.getParameter("jobTitle");
		String companyname=request.getParameter("company");
		String country=request.getParameter("country");
		String category=request.getParameter("category");
		String skills=request.getParameter("skills");
		String bio=request.getParameter("bio");
		String linkedinUrl=request.getParameter("linkedinUrl");
		String personalWebsite=request.getParameter("personalWebsite");
        
//		Part filePart = request.getPart("photo");
//        String filename=filePart.getSubmittedFileName();
//        InputStream in=filePart.getInputStream();
//        String queryimage="insert into mentorprofile(img) values(?)";
//        try {
//			PreparedStatement ps2=DbConnection.connect().prepareStatement(queryimage);
//			ps2.setBlob(1, in);
//			ps2.executeUpdate();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
        
		
		Mentorbean obj= new Mentorbean(fname,lname,mentoremail,mentorpassword,jobtitle,companyname,country,category,skills,bio,linkedinUrl,personalWebsite);
		Mentorservices service=new Mentorservices();
		String msg=null;
		try {
			msg = service.isregister(obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String redirectURL = "Mentorregiseration.jsp?message=" + msg;
	    response.sendRedirect(redirectURL);
    }

	
	

}
