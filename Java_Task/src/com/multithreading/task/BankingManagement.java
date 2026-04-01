package com.multithreading.task;

class BankAccount{
	int balance=5000;
	BankAccount(int balance){
		this.balance=balance;
	}
	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName());
		balance=balance+amount;
		System.out.println("total amount after deposit: "+balance);
	          
	}
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName());
		if(amount>balance) {
			System.out.println("insufficient funds");
		
		}
		else {
		balance=balance-amount;
		System.out.println("current balance: "+balance);
		
		}
		
		
		
	}
}
class CustomerThread extends Thread{
	BankAccount account;
	String name;
	CustomerThread(BankAccount account,String name){
		this.account=account;
		this.name=name;
	}
	
	@Override
	public void run() {
		//System.out.println(name);
		account.deposit(1000);
		account.withdraw(500);
		
	}
}
public class BankingManagement {

	public static void main(String[] args) {
		BankAccount bank=new BankAccount(5000);
		CustomerThread th1=new CustomerThread(bank,"sruthi");
		CustomerThread th2=new CustomerThread(bank,"mahi");
		th1.start();
		th2.start();
		
		

	}

}
