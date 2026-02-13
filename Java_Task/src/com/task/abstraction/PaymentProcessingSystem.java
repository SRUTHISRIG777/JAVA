package com.task.abstraction;
abstract class Payment{
	public abstract void processPayment();
	public abstract void validateTransaction();
	public void generateTransactionId() {
		int transactionId=(int)(Math.random()*1000000000);
		System.out.println("generated transaction id: "+transactionId);
	}
}
class CreditCardPayment extends Payment{
	String cardNumber;
	String expiryDate;
	String cvv;
	
	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	public void processPayment() {
		System.out.println("Processing credit card payment.");
		
	}
	public void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV.");
		
		
	}
	
}
class UPIPayment extends Payment{
	String 	upiId;
	String phonenumber;
	
  public UPIPayment(String upiId, String phonenumber) {
		
		this.upiId = upiId;
		this.phonenumber = phonenumber;
	}
	
	public void processPayment() {
		System.out.println("Processing UPI payment.");
		
	}
	
	public void validateTransaction() {
		System.out.println("Validating UPI ID and phone number");
		
		
	}

}
class PayPalPayment extends Payment{
	String 	email;
	String authToken;
	
 
	
	public PayPalPayment(String email, String authToken) {
		
		this.email = email;
		this.authToken = authToken;
	}

	public void processPayment() {
		System.out.println("Processing paypal payment.");
		
	}
	
	public void validateTransaction() {
		System.out.println("Validating email and authentication");
		
		
	}
	
}


public class PaymentProcessingSystem {

	public static void main(String[] args) {
		Payment p1=new UPIPayment("user@upi","1234567890");
		Payment p2=new CreditCardPayment("1234567890123456","12/25","123");
		Payment p3=new PayPalPayment("user@example.com","abc123");
		System.out.println("========upi payment===============");
		p1.processPayment();
		p1.validateTransaction();
		p1.generateTransactionId();
		System.out.println("==============credit card payment===========");
		p2.processPayment();
		p2.validateTransaction();
		p2.generateTransactionId();
		System.out.println("=============paypal payment==========");
		p3.processPayment();
		p3.validateTransaction();
		p3.generateTransactionId();

	}

}
