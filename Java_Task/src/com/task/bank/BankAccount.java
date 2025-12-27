package com.task.bank;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter your name: ");
	  String name=sc.next();
	  System.out.println("Enter your address: ");
	  String address=sc.next();
	  System.out.println("Enter your phoneNumber: ");
	  long number=sc.nextLong();
	  System.out.println("Enter your initial deposit balance: ");
	  double balance=sc.nextDouble();
	  System.out.println("Accont Created Successfully ");
	  BankApplication b1=new BankApplication(name,address,number,balance);
	  int option;
	  while(true) {
		  System.out.println();
		  System.out.println("*Select Options from below*");
		  System.out.println("1.deposit");
		  System.out.println("2.withdraw");
		  System.out.println("3.showbalance");
		  System.out.println("4.exit");
		  System.out.print("Enter your option [1-4]:" );
		  option=sc.nextInt();
		  
		  switch(option) {
		  case 1:
			  System.out.println("enter deposit money: ");
			  double amount1=sc.nextDouble();
			  b1.deposit(amount1);
			  break;
		  case 2:
			  System.out.println("enter withdraw money");
			  double amount2=sc.nextDouble();
			  b1.withdraw(amount2);
			  break;
		  case 3:
			  System.out.println("your balance is: ");
			  b1.showBalance();
			  break;
		  case 4:
			  System.out.println("thank you!");
			  break;
		 default:
			 System.out.println("please enter 1-4 options only");
			  
			  
		  }
		  if(option==4) {
			  break;
		  }
		  
		  
		  
	  }

	}

}
