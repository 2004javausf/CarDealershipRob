package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {
	
	public void createEmployee();
	
	//Insert employee
	public void insertEmployee(String firstName, String lastName, String userName, String password) throws SQLException;
	
	//Read employees
	public List<Employee> getEmployeeList() throws SQLException;
}
