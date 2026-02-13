package com.practice.interfaces;


interface Payment {
 
 void pay(double amount);

 default void printReceipt(double amount) {
     System.out.println("Payment successful of Rs. " + amount);
 }

 static boolean validateAmount(double amount) {
     return amount > 0;
 }
}


interface Reward {
 
 default void printReceipt(double amount) {
     System.out.println("Reward points added for Rs. " + amount);
 }
}

class CreditCardPayment implements Payment, Reward {

 @Override
 public void pay(double amount) {
     System.out.println("Paid Rs. " + amount + " using Credit Card");
 }

 @Override
 public void printReceipt(double amount) {
     Payment.super.printReceipt(amount);
     Reward.super.printReceipt(amount);
 }
}

public class Main {
 public static void main(String[] args) {

     double amount = 5000;

     if (Payment.validateAmount(amount)) {

         CreditCardPayment payment = new CreditCardPayment();
         payment.pay(amount);
         payment.printReceipt(amount);

     } else {
         System.out.println("Invalid Amount");
     }
 }
}

