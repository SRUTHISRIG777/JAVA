package com.example;

import java.util.Scanner;

public class Patterns {
	public static void square(int n) {
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=n;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
	}
	public static void rectangle(int n) {
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=n*2;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
		
	}
	public static void triangle(int n) {
		for(int i=1;i<=n;i++) {
			String s="";
			for(int j=1;j<=i;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value for square:");
		int n1=sc.nextInt();
		square(n1);
		System.out.println();
		System.out.println("enter n value for rectangle:");
		int n2=sc.nextInt();
		rectangle(n2);
		System.out.println();
		System.out.println("enter n value for triangle:");
		int n3=sc.nextInt();
		triangle(n3);

	}

}
