package com.task.inheritance;

import java.util.Scanner;

public class Swapping {
	public static void swappingNumbers(int num1,int num2){
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swapping:");
		System.out.println(num1+" "+num2);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		System.out.println("before swapping:");
		System.out.println(num1+" "+num2);
		swappingNumbers(num1,num2);
		

	}

}
