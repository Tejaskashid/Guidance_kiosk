package com.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.Userbean;
import com.connection.DbConnection;

public class Userservices {
	public static String isregister(Userbean user) {
		String query="insert into users (firstname,lastname,age,email,password) values(?,?,?,?,?)";
		try {
			PreparedStatement ps=DbConnection.connect().prepareStatement(query);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.executeUpdate();
			return "User regisetration succesfull";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "User registeration failed";
	}
}
