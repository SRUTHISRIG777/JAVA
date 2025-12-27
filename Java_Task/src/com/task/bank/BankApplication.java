package com.task.bank;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	public BankApplication(String customerName, String customerAddress,long phoneNumber, double balance) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("amount must be greater than zero");
		}
		else {
			balance+=amount;
		System.out.println("deposit success, available balance: "+balance);
		}
		
	}
	public void withdraw(double amount) {
		if(getBalance()<amount) {
			System.out.println("your balance is insufficient cannot withdraw");
			
		}
		else {
			balance-=amount;
			System.out.println("withdraw success, available balance: "+balance);
			
		}
		
	}
	public void showBalance() {
		System.out.println(balance);
	}


}
