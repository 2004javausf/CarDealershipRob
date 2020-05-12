package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {
	
	//create customer
	public void createCustomer();
	
	//Add new customer
	public void insertCustomer(String firstName, String lastName, String userName, String password, int accountNumber, int offers) throws SQLException;

	//Read all customers
	public List<Customer> getCustomerList() throws SQLException;
}
