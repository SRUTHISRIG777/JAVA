package com.arrays.task2;

public class One {

	public static void main(String[] args) {
		int[] arr=UtilityArray.getData();
		for(int i:arr) {
			System.out.println(i);
		}
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("sum of array elements:"+sum);

	}

}
