package com.arrays.task1;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		String[] arr=new String[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter element:");
			arr[i]=sc.next();
		}
		for(String str:arr) {
			System.out.println(str);
		}

	}

}
