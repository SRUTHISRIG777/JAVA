package com.arrays.matrix;

import java.util.Arrays;


public class Transpose {
	public static void matrixAddition(int[][]arr1,int[][] arr2) {
		int[][] result=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	public static int findLargest(int[][] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	public static void rowSumAndColSum(int[][]arr1) {
		for(int i=0;i<arr1.length;i++) {
			int sum=0;
			for(int j=0;j<arr1[i].length;j++) {
				sum+=arr1[i][j];
			}
			System.out.println(sum);
		}
		for(int j=0;j<arr1[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr1.length;i++) {
				sum+=arr1[i][j];
				
			}
			System.out.println(sum);
		}
	}
	public static void diagonalAndAntiDiagonal(int[][] arr) {
		System.out.println("diagonal");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println();
		}
		System.out.println("anti diagonal");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i+j==arr.length-1) {
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println();
		}
	}
	/**  0 1
	 * 0 1 2
	 * 1 3 4
	 * 2 3
	 * @param args
	 */

	public static void main(String[] args) {
		int[][]arr1= {{8,2},{3,4}};
		int[][]arr2= {{1,2},{3,4}};
		//matrixAddition(arr1,arr2);
		//System.out.println(findLargest(arr1));
		//rowSumAndColSum(arr1);
		diagonalAndAntiDiagonal(arr1);
		
		/**
		 * 1 2
		 * 3 4
		 * 
		 * 1 3
		 * 2 4
		 */
	   // System.out.println(Arrays.toString(arr1));
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				System.out.print(arr1[j][i]);
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<arr1[0].length;i++) {
//			for(int j=0;j<arr1.length;j++) {
//				System.out.print(arr1[j][i]);
//			}
//			System.out.println();
//		}
//		

	}

}
