package com.task.inheritance;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		if(num==2) {
			return true;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();

		if(isPrimeNumber(num)) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}

}
