package com.arrays.task5;

import java.util.Arrays;

public class SecondLargest {
	public static  void findingSecondLargest(int[] arr) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i:arr) {
			if(max1<i) {
				max2=max1;
				max1=i;
				}
			else if(max1>i&&i>max2) {
				max2=i;
			}
		}
		System.out.println("second largest: "+max2);
	}


	public static void main(String[] args) {
		findingSecondLargest(new int[]{12,35,1,10,34,1});
		
		

	}

}
