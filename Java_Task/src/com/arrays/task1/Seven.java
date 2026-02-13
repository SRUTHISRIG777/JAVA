package com.arrays.task1;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		String[] arr=new String[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter city name:");
			arr[i]=sc.next();
		}
		for(String str:arr) {
			System.out.println(str);
		}

	}

}
