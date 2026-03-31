package com.threading.one;
class A extends Thread{
	public void running() {
		System.out.println("hi there");
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Thread obj=new A();
		Thread obj1=new A();
		obj.start();
		System.out.println("main ended");
		//obj.start();--->exception
		obj1.start();
		System.out.println("main");
		

	}

}
