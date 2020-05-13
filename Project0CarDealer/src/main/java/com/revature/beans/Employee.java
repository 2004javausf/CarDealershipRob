package com.revature.beans;

public class Employee {
	

	private String userName;
	private String password;
	
	public Employee() {
		super();

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Employee(String userName, String password) {
		super();
		
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", password=" + password + "]";
	}	
}
