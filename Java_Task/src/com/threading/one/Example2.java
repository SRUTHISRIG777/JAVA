package com.threading.one;
class B implements Runnable{

	@Override
	public void run() {
		System.out.println("hello there");
		
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		System.out.println("main started");
		B obj1=new B();
		Thread obj2=new Thread(obj1);
		obj2.start();
		System.out.println("main ended");
		

	}

}
