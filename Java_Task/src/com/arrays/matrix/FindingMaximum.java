package com.arrays.matrix;

public class FindingMaximum {
	public static int getMax(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
				
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		System.out.println("max element: "+getMax(arr));
		

	}

}
