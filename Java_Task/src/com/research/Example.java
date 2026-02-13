package com.research;
//class Parent{
//	public static void print() {
//		System.out.println("hello from parent class");
//	}
//}
//class Child extends Parent{
//	
//	public  static void print() {
//		System.out.println("hello from child class");
//	}
//}
class X implements Example2{
	public static void print() {
		Example2.data();
		System.out.println("this is child");
	}
	
}

public class Example {

	public static void main(String[] args) {
		//Parent p=new Child();
		//p.print();//hello from parent
		//Child ch=new Child();
		//ch.print();//hello from child
		X e=new X();
		e.print();
		
		Example2.data();
		
		

	}

}
