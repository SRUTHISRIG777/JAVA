package com.arrays.task2;

import java.util.Scanner;

public interface UtilityArray {
	public static int[] getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		if(size<=0) {
			return null;
		}
		else {
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter element-"+(i+1));
				arr[i]=sc.nextInt();
			}
			return arr;
		}
	}
	public static String[] getResult() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		if(size<=0) {
			return null;
		}
		else {
			String[] arr=new String[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter element-"+(i+1));
				arr[i]=sc.next();
			}
			return arr;
		}
		
	}


}
