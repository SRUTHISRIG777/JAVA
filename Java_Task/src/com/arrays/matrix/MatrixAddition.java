package com.arrays.matrix;

import java.util.Arrays;

public class MatrixAddition {
	public static void matrixAddition(int[][]arr1,int[][] arr2) {
		int[][] result=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}

	public static void main(String[] args) {
		int[][] arr1= {{1,2,3},{4,5,6}};
		int[][] arr2= {{1,2,3},{4,5,6}};
		
		
		matrixAddition(arr1,arr2);

	}

}
