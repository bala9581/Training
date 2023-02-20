package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/class";
		String username="root";
		String password="bala9581";
		Connection connection=DriverManager.getConnection(url, username, password);
		if(connection!=null) 
			System.out.println("Connection established");
		String sql="select * from college";
		 PreparedStatement ps=connection.prepareStatement(sql);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"  "+rs.getString("sname")+" "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
		 }
		}
		
	}


