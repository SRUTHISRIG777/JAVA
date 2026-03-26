package com.arrays.matrix2;

public class UpperTriangleMatrix {
	public static boolean getResult(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(i>j) {
					if(nums[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums= {{1,2,3},{0,1,2},{0,0,1}};
		System.out.println(getResult(nums));

	}

}
