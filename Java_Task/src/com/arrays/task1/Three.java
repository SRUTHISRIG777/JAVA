package com.arrays.task1;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		double[] arr=new double[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter element-"+i+1);
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
