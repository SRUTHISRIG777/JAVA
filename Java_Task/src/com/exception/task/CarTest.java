package com.exception.task;

import java.util.Scanner;

class CarStopped extends Exception{
	public CarStopped(String msg) {
		super(msg);
	}
}
class CarPuncture extends Exception{
	public CarPuncture(String msg) {
		super(msg);
	}
}
class CarHeat extends Exception{
	public CarHeat(String msg) {
		super(msg);
	}
}



public class CarTest {
	public static void stop(String str){

		try {
			if(str.equals("stop")) {
				throw new CarStopped("car stopped");
			}
			else {
				System.out.println("car not stalled");
			}
		}
		catch(CarStopped e) {
			System.out.println(e.getMessage());
		}
	}
	public static void puncture(String str){

		
		try {
			if(str.equals("puncture")) {
				throw new CarStopped("car is punctured");
			}
			else {
				System.out.println("car not punctured");
			}
		}
		catch(CarStopped e) {
			System.out.println(e.getMessage());
		}
	}
	public static void carHeat(int heat){

		try {
			if(heat>50) {
				throw new CarHeat("car is heated more than 50 degrees");
			}
			else {
				System.out.println("car not stalled");
			}
		}
		catch(CarHeat e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter input: ");
//		String str=sc.next();
		
		stop("stop");
		puncture("puncture");
		carHeat(40);
		
		
		

	}

}
