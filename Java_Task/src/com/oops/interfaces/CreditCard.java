
package com.oops.interfaces;

public class CreditCard implements Payment{
	double creditLimit=10000;
	public void pay(double amount) {
		creditLimit=creditLimit-amount;
		System.out.println("paid "+amount+" using credit card");
		
		
	}
	public void refund(double amount) {
		creditLimit+=amount;
		System.out.println("refunded "+amount+" to credit card");
	}
	public void checkBalance() {
		System.out.println("available crdit: "+creditLimit);
	}

}
