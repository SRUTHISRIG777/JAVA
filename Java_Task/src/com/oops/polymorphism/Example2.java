package com.oops.polymorphism;
class A{
	
	public void add(Integer a,Integer b) {
		System.out.println("Integer ");
	}
}
class B extends A{
//	public void add(int c,int d) {
//		System.out.println("child class-1");
//	}
//	public void add(int a,int b) {
//		System.out.println("child class-2");
//	}
	public void add(int a,int b) {
		super.add(187, 200);
		System.out.println("child class");
	}
	
}

public class Example2 {
	

	public static void main(String[] args) {
		A a=new B();
		B b=(B)a;
		Integer c=30;
		Integer d=40;
		b.add(c,d);
		
		//B c=new B();
		//c.add(2, 3);
		//.add(38.5,40);
		

	}

}
