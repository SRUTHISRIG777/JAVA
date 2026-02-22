package com.arrays.task5;

public class MinAndMax {
	public static void findingMinAndMax(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
			if(i>max) {
				max=i;
			}
		}
		System.out.println("max value: "+max);
		System.out.println("min value: "+min);
	}

	public static void main(String[] args) {
		int[] arr= {3,9,2,5,6};
		findingMinAndMax(arr);
		

	}

}
