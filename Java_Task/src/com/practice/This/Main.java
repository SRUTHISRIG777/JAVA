package com.practice.This;

class X{
	public X(int a) {
		System.out.println("X contructor"+a);
	}
	public X() {
		
	}
	
}
class Y extends X{
   public Y() {
	   
	   System.out.println("Y consturctor");
   }
	
}

public class Main {
	public static void main(String[] args) {
		new Y();

	}

}
