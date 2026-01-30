package com.oops.polymorphism;

public class Example1 {
	public void add(byte a,byte b) {
		System.out.println("byte:"+(a+b));
	}
	public void add(short a,short b) {
		System.out.println("short:"+(a+b));
	}
	public void add(int a,int b) {
		System.out.println("int:"+(a+b));
	}
	public void add(long a,long b) {
		System.out.println("long:"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("float:"+(a+b));
	}
	public void add(double a,double b) {
		System.out.println("double:"+(a+b));
	}
	
	

	public static void main(String[] args) {
//		short a=10;
//		short b=10;
		new Example1().add(10.7f,20.8);
		

	}

}
