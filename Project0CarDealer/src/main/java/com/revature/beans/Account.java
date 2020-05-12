package com.revature.beans;

public class Account {
	
	private int accountNumber;
	private double deposits;
	private double accountBalance;
	
	public Account() {
		super();
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getDeposits() {
		return deposits;
	}
	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public Account(int accountNumber, double deposits, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.deposits = deposits;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", deposits=" + deposits + ", accountBalance="
				+ accountBalance + "]";
	}
}
