package com.arrays.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		if(size>0) {
			String[] names=new String[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter name- "+(i+1));
				names[i]=sc.next();
			}
			System.out.println(Arrays.toString(names));
		}
		else {
			System.out.println("enter valid size");
		}

	}

}
