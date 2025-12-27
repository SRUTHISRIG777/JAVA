package com.practice.This;

public class Example {
//	 a=10;
//	void display() {
//		System.out.println(this.a);
//	}
	
//	public void show() {
//		System.out.println("display method called");
//	}
//	public void display() {
//		this.show();
//	}
//	String text="java";
//	public void display() {
//		String text="Hello";
//		System.out.println(text);
//	}

//	int x=100;
//	class Inner{
//		int x=50;
//		void display() {
//			System.out.println(x);
//		}
//	}
	
	
//	int value;
//	public Example setValue(int value) {
//		this.value=value;
//		return this;
//	}
//	public void show() {
//		this.value=50;
//		System.out.println(this.value);
//	}
	
//	public int add(int a,int b) {
//		return a+b;
//	}
//	public void compute() {
//		int result=add(5,10);
//		System.out.println(result);
//		
//	}
	public void process() {
		log(this);
	}
	public void log(Example p) {
		System.out.println("logging processor:"+p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Example().display();
		Example obj1=new Example();
		Example obj2=new Example();
//		obj1.display();
//		obj2.display(p);
		//System.out.println(obj1.x);	
//		Example.Inner obj2=obj1.new Inner();
//		obj2.display();
//		obj1=obj1.setValue(20);
//		System.out.println(obj1);
//		obj1.show();
//		
//		obj1.compute();
//		Example obj2=new Example();
//		int result=obj2.add(2,3);
//		System.out.println(result);
//		obj2.compute();
		obj1.process();
		System.out.println(obj1);
         obj1.log(obj2);
         System.out.println(obj2);
	}

}
