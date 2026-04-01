package com.multithreading.task;

class Printer{
	int paperCount;
	Printer(int paperCount){
		this.paperCount=paperCount;
	}
	public synchronized  void printDocument(String document, String userName) {
		
			if(paperCount>0) {
				paperCount--;
				System.out.println(userName);
				System.out.println(document);
				System.out.println("available papers: "+paperCount);
				
			}
			else {
				System.out.println(userName);
				System.out.println(document);
				System.out.println("paper  is not available");
				return;
			}
		
	}
}
class User extends Thread{
	String name;
	Printer printer;
	String document;
	public User(String name, Printer printer, String document) {
		
		this.name = name;
		this.printer = printer;
		this.document = document;
	}
	public void run() {
		printer.printDocument(document, name);
	}
	
}

public class SharedPrinter {

	public static void main(String[] args) {
		Printer printer=new Printer(3);
		User us1=new User("sruthi",printer,"resume");
		User us2=new User("mahi",printer,"adhar card");
		User us3=new User("riya",printer,"certificate");
		User us4=new User("junnu",printer,"papers");
		try {
			us1.start();
			us1.join();
			us2.start();
			us2.join();
			us3.start();
			us3.join();
			us4.start();
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
