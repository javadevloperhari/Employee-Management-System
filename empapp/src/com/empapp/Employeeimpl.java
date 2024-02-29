package com.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employeeimpl implements Employeeinterf{
	Connection con;

	public void createEmployee(Employee emp) throws SQLException {
		con=dbconnection.createDBconnection();
		String query="insert into employee1 values(?,?,?,?);";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,emp.getId());
		pst.setString(2,emp.getName());
		pst.setDouble(3,emp.getSalery());
		pst.setInt(4,emp.getAge());
		int cnt=pst.executeUpdate();
		con.close();
		if(cnt>0)
			System.out.println("Employee Inserted Sucessfully !!!");
	}

	
	public void showAllEmployee() throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from employee1;";
		con=dbconnection.createDBconnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("Employee Detailes...!");
		System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALERY","AGE");
		while(rs.next()) {
//			String userdata=rs.getInt(1) + ": " +rs.getString(2) +":"+ rs.getDouble(3) + ":" + rs.getInt(4);
//			System.out.println(userdata);
			System.out.format("%d\t%s\t%f\t%d\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			
		}
		con.close();
		st.close();	
		
	}

	
	public void showEmployeeBasedOnId(int id) throws SQLException {
		String query="select * from employee1 where id="+id;
		con=dbconnection.createDBconnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("Employee Detailes...!");
		System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALERY","AGE");
		while(rs.next()) {
			System.out.format("%d\t%s\t%f\t%d\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			
		}
		con.close();
		st.close();	
		
		
	}

	
	public void updateEmployee(int id, String name) throws SQLException {
		String query="update employee1 set ename=? where id=?";
		con=dbconnection.createDBconnection();
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setString(1, name);
		pstm.setInt(2, id);
		int cnt=pstm.executeUpdate();
		if (cnt!=0) {
			System.out.println("Employe Deatailes Updated sucessfully...!");
		}
			
		
		
		
	}

	public void deleteemployee(int id) throws SQLException {
		String query="delete from employee1 where id =" + id;
		//String query="delete from employee1 where id=;" + id; 
	    con=dbconnection.createDBconnection();
		Statement st=con.createStatement();
		int cnt=st.executeUpdate(query);
		if (cnt!=0) {
			System.out.println("Deleted sucessfully...!");
		}
		
		st.close();

	}

}
