package com.exception.task;

import java.util.Scanner;

class Handling{
	public static void tiMethod(int num) {
		try {
			System.out.println("10000");
			tilMethod(num);
			System.out.println("coders");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void tilMethod(int num) {
		try {

			if(num==0) {
				System.out.println(num/0);
				throw new ArithmeticException();
			}

			else {
				System.out.println("completed");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception: "+e.getMessage());
		}
		finally{
			System.out.println("finally");
			
		}
		
		
	}
}


public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		Handling.tiMethod(n);

	}

}
