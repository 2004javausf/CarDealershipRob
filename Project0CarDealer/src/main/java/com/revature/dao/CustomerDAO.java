package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {
	
	public void createCustomer(String userName, String password);
		
	//Add new customer
	public void insertCustomer(String firstName, String lastName, String userName, String password) throws SQLException;

	//Read all customers
	public List<Customer> getCustomerList() throws SQLException;
}
