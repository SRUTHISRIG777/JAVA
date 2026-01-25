package com.bank.console;
import java.util.Scanner;

import com.bank.customers.CustomerAccount;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		
		System.out.println("enter phone number");
		long number=sc.nextLong();
		sc.nextLine();
		System.out.println("enter account type:");
		String type=sc.nextLine();
		CustomerAccount c1=new CustomerAccount(name,number,type);
		
		boolean a=true;
		while(a) {
			System.out.println("select below options:");
			System.out.println("1.update address");
			System.out.println("2.update phone");
			System.out.println("3.activate KYC");
			System.out.println("4.deposite");
			System.out.println("5.withdraw");
			System.out.println("6.view summary");
			System.out.println("7.exit");
			System.out.println("enter option:");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter address to update:");
				String address=sc.nextLine();
				c1.setAddress(address);
				break;
			case 2:
				System.out.println("enter phone number to update:");
				number=sc.nextLong();
				c1.setPhoneNumber(number);
				break;
			case 3:
				System.out.println("enter document type:");
				String doctype=sc.nextLine();
				c1.activateKYC(doctype);
				break;
			case 4:
				System.out.println("enter money to deposit");
				double deposite=sc.nextDouble();
				if(deposite>0) {
					c1.setBalance(deposite);
					System.out.println("updated balance:"+c1.getBalance());
					
				}
				else {
					System.out.println("deposite money must be greater than zero");
				}
				break;
			case 5:
				System.out.println("enter money to withdraw");
				double withdraw=sc.nextDouble();
				if(withdraw>10000) {
					if(c1.isKycStatus()) {
					if(c1.getBalance()<=0) {
						System.out.println("can not be withdraw");
						
					}
					else {
						c1.setBalance(c1.getBalance()-withdraw);
						System.out.println("money withdraw successfull");
						System.out.println("remaining balance:"+c1.getBalance());
						
					}}
					else {
						System.out.println("can not withdraw");
					}
				}
				
				break;
			case 6:
				System.out.println(c1.viewAccountSummary());
				break;
			case 7:
				a=false;
				System.out.println("thank you");
				break;
			default:
				System.out.println("please enter valid option");
			
			}
		}

	}

}
