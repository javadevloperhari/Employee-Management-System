package com.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	static Connection con;
	public static Connection createDBconnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String pass="Hari@1028";
		Connection con=DriverManager.getConnection(url,username,pass);

		return con;
	}

}
