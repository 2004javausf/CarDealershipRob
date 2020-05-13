package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.io.EmployeeIO;
import com.revature.util.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	public static List<Employee> employeeList = new ArrayList<Employee>();
	
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void insertEmployee(String firstName, String lastName, String userName, String password) throws SQLException {
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO EMPLOYEE VALUES(ESEQ.NEXTVAL, ?, ?, ?, ?");

		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, userName);
		ps.setString(4, password);
		ps.executeUpdate();	
	}
	@Override
	public List<Employee> getEmployeeList() throws SQLException {
		List<Employee> employeeList = new ArrayList<Employee>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
		Employee e = null;
		while (rs.next()) {
			e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			employeeList.add(e);
		}
		return employeeList;
	}
	@Override
	public void createEmployee(String userName, String password) {
		EmployeeIO.readEmployeeFile();
		List<Employee> eList = EmployeeDAOImpl.employeeList;
		Scanner txtInput = new Scanner(System.in);
		
		String username;
		String password1;
		
		System.out.println("Enter user name");
		userName = txtInput.nextLine();
		System.out.println("Enter password");
		password1 = txtInput.nextLine();
		for (int i = 0; i < eList.size(); i++) {
			Employee employee = new Employee(userName, password1);			
		}
		
	}

}
