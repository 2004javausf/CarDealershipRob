package com.revature.dao;

import java.sql.SQLException;

public interface AccountDAO {
	
	public void createAccount();
	
	public void insertAccount(int accounNumber, double deposits, int accountBalance) throws SQLException;

}
