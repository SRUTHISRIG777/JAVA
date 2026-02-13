
package com.oops.interfaces;

public class GooglePay implements Payment {
	
	double balance=5000;
	public void pay(double amount) {
		balance=balance-amount;
		System.out.println("paid: "+amount +"  using google pay");
	}
	public void refund(double amount) {
		balance=balance+amount;
		System.out.println("refunded "+amount+" to google pay");
	}
	public void checkBalance() {
		System.out.println("google pay balance: "+balance);
	}

}
