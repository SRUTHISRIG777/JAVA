package com.arrays.matrix2;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void getResult(int[][] nums1,int[][] nums2) {
		int row1=nums1.length;
		int col1=nums1[0].length;
		int row2=nums2.length;
		int col2=nums2[0].length;
		if(col1!=row2) {
			return;
		}
		int[][] result=new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<row2;k++) {
					result[i][j]+=nums1[i][k]*nums2[k][j];
				}
				
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		
	}

	public static void main(String[] args) {
		int[][] nums1= {{1,2,3},{4,5,6}};
		int[][] nums2= {{7,8},{9,10},{11,12}};
		getResult(nums1,nums2);
		

	}

}
