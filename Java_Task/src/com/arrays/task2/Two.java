package com.arrays.task2;

import java.util.Arrays;

public class Two {

	public static void main(String[] args) {
		int[] arr=UtilityArray.getData();
		System.out.println(Arrays.toString(arr));
		int even_count=0;
		int odd_count=0;
		for(int i:arr) {
			if(i%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("even count: "+even_count);
		System.out.println("odd_count: "+odd_count);

	}

}
