package com.mediumProblems;

public class Question3 {
	public static boolean isValidAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int[] freq=new int[26];
		for(char ch:str1.toCharArray()) {
			freq[ch-'a']++;
		}
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			freq[ch-'a']--;
			if(freq[ch-'a']<0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidAnagram("abc","aca"));

	}

}
