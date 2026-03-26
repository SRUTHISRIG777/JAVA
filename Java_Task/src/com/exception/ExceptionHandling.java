package com.exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		int result=num1/num2;
		System.out.println("result: "+result);
	}
	catch(ArithmeticException e) {
		System.err.println("Exception: "+e.getMessage());
	}
	catch(Exception e) {
		System.err.println("Exception: "+e.getMessage());
	}
	finally {
		sc.close();
	}
}
}
