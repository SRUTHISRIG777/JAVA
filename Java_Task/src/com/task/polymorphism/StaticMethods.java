package com.task.polymorphism;
class Parent{
	public static void print() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	//@Override not overriding
	public static void print() {
		System.out.println("child");
	}
}

public class StaticMethods {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p2=new Child();
		p1.print();//parent
		//p2.print();//parent
		Child c=new Child();
		c.print();
		
		

	}

}
