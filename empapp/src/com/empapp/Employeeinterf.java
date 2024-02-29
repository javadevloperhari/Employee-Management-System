package com.empapp;

import java.sql.SQLException;

public interface Employeeinterf {
	//create employee
	public void createEmployee(Employee emp) throws SQLException;
	//show all employee
	public void showAllEmployee() throws SQLException;
	//show employee based on id
	public void showEmployeeBasedOnId(int id) throws SQLException;
	//update employee
	public void updateEmployee(int id,String name) throws SQLException;
	//delete employee
	public void deleteemployee(int id) throws SQLException;
	
	

}
