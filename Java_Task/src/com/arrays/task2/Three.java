package com.arrays.task2;

import java.util.Arrays;

public class Three {

	public static void main(String[] args) {
		int[] arr=UtilityArray.getData();
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
