package com.mediumProblems;

public class LargestOddInteger {
	public static String getResult1(String str) {
		if(Integer.valueOf(str.charAt(str.length()-1))%2!=0) {
			return str;
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			if(Integer.valueOf(str.charAt(i))%2!=0) {
				return str.substring(0,i+1);
				
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(getResult1("12346"));
		

	}

}
