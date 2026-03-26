package com.arrays.matrix;

import java.util.Arrays;
public class RowSumAndColSum {
	public static void getRowSum(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
				
			}
			System.out.println(sum);
		}
}
	public static void getColSum(int[][]arr) {
		for(int j=0;j<arr[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("row sum:");
		getRowSum(arr);
		System.out.println("col sum:");
		getColSum(arr);
		
		

	}

}
