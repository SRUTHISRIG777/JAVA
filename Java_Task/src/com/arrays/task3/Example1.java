package com.arrays.task3;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
	    int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		int[] arr3=new int[arr1.length+arr2.length];
		int j=0;
//		while(j<arr3.length) {
//		for(int i=0;i<arr1.length;i++) {
//			arr3[j]=arr1[i];
//			j++;
//		}
//		for(int i=0;i<arr2.length;i++) {
//			arr3[j]=arr2[i];
//			j++;
//		}
//		}
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
		

}
}
