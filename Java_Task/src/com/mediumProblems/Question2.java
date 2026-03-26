package com.mediumProblems;

public class Question2 {
	public static void getResult(String str) {//ABCD
		/**
		 * A
		 * AB
		 * ABC
		 * ABCD
		 */
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
				
		}
	}

	public static void main(String[] args) {
		//System.out.println(getResult("ABCD"));
		getResult("ABCD");
		

	}

}
