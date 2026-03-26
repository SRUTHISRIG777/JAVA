package com.mediumProblems;

public class LongestPrefix {
	public static void getResult(String[] str) {
		 int shortest=str[0].length();
		 String result="";
		 for(int i=1;i<str.length;i++) {
			 if(str[i].length()<shortest) {
				 shortest=str[i].length();
				 result=str[i];
				 //System.out.println(str[i]);
			 }
		 }
		 //System.out.println(result);
		 //System.out.println(shortest);//   flower  flex   flow float
		 String prefix="";
		
		 for(int i=0;i<result.length();i++) {
			 int count=0;
			 for(int j=0;j<str.length;j++) {
				 if(result.charAt(i)==str[j].charAt(i)) {
					count++;
				 }
				
			 }
			 if(count==str.length) {
				 prefix+=result.charAt(i);
			 }
			 else {
				 break;
			 }
		 }
		 System.out.println(prefix);
		 
		 
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getResult(new String[] {"flower","flow","float","flex"});

	}

}
