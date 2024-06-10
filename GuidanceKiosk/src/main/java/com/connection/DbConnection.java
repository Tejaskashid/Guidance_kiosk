package com.connection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Blob;

public class DbConnection {
	
	public static Connection connect(){
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/guidance_kiosk";
		String name="root";
		String password="tejas@512";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,name,password);
			return con;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}


	
	 
}
