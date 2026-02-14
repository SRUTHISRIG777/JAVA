package com.arrays.task3;

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
	
		
	}




