package com.arrays.task1;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		if(size>0) {
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter element- "+(i+1));
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("enter valid size");
		}
		
		

	}

}
