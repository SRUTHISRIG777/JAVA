
package com.oops.interfaces;

public class PaymentMain {

	public static void main(String[] args) {
		Payment p1=new GooglePay();
		System.out.println("============google pay============");
		p1.pay(1000);
		p1.checkBalance();
		System.out.println("==========credit card===========");
		Payment p2=new CreditCard();
		p2.pay(2000);
		p2.checkBalance();

	}

}
