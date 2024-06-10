package com.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.Mentorbean;
import com.beans.Userbean;
import com.connection.DbConnection;

public class Mentorservices {
	public static String isregister(Mentorbean mentor) throws SQLException {
		String query="insert into mentorprofile (first_name,last_name,email,password,jobtitle,companyname,location,category,skills,Bio,linkedin,personal_website)values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=DbConnection.connect().prepareStatement(query);
		try {
			ps.setString(1, mentor.getFirstname());
			ps.setString(2, mentor.getLastname());
			ps.setString(3, mentor.getEmail());
			ps.setString(4, mentor.getPassword());
			ps.setString(5, mentor.getJobtitle());
			ps.setString(6, mentor.getCompanyname());
			ps.setString(7, mentor.getLocation());
			ps.setString(8, mentor.getCategory());
			ps.setString(9, mentor.getSkills());
			ps.setString(10, mentor.getText());
			ps.setString(11, mentor.getLinkedinurl());
			ps.setString(12, mentor.getPersonalwebsite());

			
			int ans=ps.executeUpdate();
			if(ans>0) {
				return "Registeration succefull";
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
                if (ps != null) {
                    ps.close(); // Close PreparedStatement
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Close the connection after handling the PreparedStatement
            DbConnection.connect().close();;
        }

		return "Registeration unsuccesfull";
	}
}	
