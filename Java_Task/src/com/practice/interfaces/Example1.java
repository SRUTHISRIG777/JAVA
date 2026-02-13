package com.practice.interfaces;
//interface X{
//	 static void printData() {
//		System.out.println("this is from X");
//	}
//}
//class Y{
//	
//	public static void printData() {
//		X.printData();
//		System.out.println("this is from Y");
//	}
//}


interface Vehicle{
	 default void startEngine() {
		System.out.println("engine start");
	}
	void stopEngine();
}
class Car implements Vehicle{
	public void stopEngine() {
		System.out.println("engine stop");
	}
	public void startEngine() {
		System.out.println("engine is started from vehicle");
	}
}
public class Example1 {

	public static void main(String[] args) {
		//X x=new Y();
		//x.printData();//error
//		Y y=new Y();
//		y.printData();
		
		Vehicle v=new Car();
		v.stopEngine();
		v.startEngine();
		
		
		

	}

}
