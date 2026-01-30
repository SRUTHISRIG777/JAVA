package com.task.polymorphism;
class Payment{
	Integer amount;
	Double transactionLimit;
	Payment(Integer amount,Double transactionLimit){
		this.amount=amount;
		this.transactionLimit=transactionLimit;
		
		
	}
	public void processPayment(Double paymentAmount) {
		System.out.println("parent:"+(amount-paymentAmount));
		
	}
	
}
class CreditCardPayment extends Payment{
	
	CreditCardPayment(Integer amount, Double transactionLimit) {
		super(amount, transactionLimit);
		
	}

	@Override
	public void processPayment(Double paymentAmount) {
		if(paymentAmount<=amount) {
			System.out.println("child-1:"+(amount-paymentAmount));
		}
		else {
			System.out.println("limit is exceeded");
		}
		
	}
}
class DebitCardPayment extends Payment{
	
	DebitCardPayment(Integer amount, Double transactionLimit) {
		super(amount, transactionLimit);
		
	}

	public void processPayment(Double paymentAmount) {
		if(paymentAmount<=amount) {
			System.out.println("child-2:"+(amount-paymentAmount));
			}
			else {
				System.out.println("limit is exceeded");
			}
		
	}
}
class UPIPayment extends Payment{
	
UPIPayment(Integer amount, Double transactionLimit) {
		super(amount, transactionLimit);
		
	}

public void processPayment(Double paymentAmount) {
	if(paymentAmount<=amount) {
		System.out.println("child-3:"+(amount-paymentAmount));
		}
		else {
			System.out.println("limit is exceeded");
		}
		
	}
}

public class PaymentProcessingSystem {

	public static void main(String[] args) {
		
		Integer amount=10000;
		Double limit=300000.0;
		Payment p1=new CreditCardPayment(amount,limit);
		Payment p2=new DebitCardPayment(amount,limit);
		Payment p3=new UPIPayment(amount,limit);
		
		Double money=300.0;
		p1.processPayment(money);
		p2.processPayment(money);
		p3.processPayment(money);
		

	}

}
