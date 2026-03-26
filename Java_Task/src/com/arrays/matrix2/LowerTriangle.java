package com.arrays.matrix2;

public class LowerTriangle {
	public static boolean getResult(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(j>i) {
					if(nums[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] nums= {{1,0,0},{1,2,0},{1,2,3}};
		System.out.println(getResult(nums));

	}

}
