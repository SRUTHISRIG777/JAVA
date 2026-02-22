package com.arrays.task5;

import java.util.Arrays;

public class ReversingArray {
	public static void getResult(int[] arr) {
		int left=0;
		int right=arr.length-1;
		System.out.println("original array: "+Arrays.toString(arr));
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("reversed array: "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		getResult(new int[] {10,20,30,40,50});
		

	}

}
