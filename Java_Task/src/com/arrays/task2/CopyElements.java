package com.arrays.task2;

import java.util.Arrays;

public class CopyElements {

	public static void main(String[] args) {
		int[] arr=UtilityArray.getData();
		System.out.println(Arrays.toString(arr));
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	copy[i]=arr[i];
        }
        System.out.println("copied array:");
        for(int i:copy) {
        	System.out.println(i);
        }
	}

}
