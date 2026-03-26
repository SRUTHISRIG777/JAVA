package com.mediumProblems;

public class Question1 {
	public static boolean getResult(String str) {
		if(str.length()%2!=0) {
			return false;
		}
		int vowelsCount1=0;
		int vowelsCount2=0;
	
		
		for(int i=0;i<str.length()/2;i++) {
			char ch=str.charAt(i);

			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowelsCount1++;
			}
			}
		//String res1="";
		//System.out.println(vowelsCount1);
		for(int i=str.length()/2;i<str.length();i++) {
			char ch=str.charAt(i);
			//res1+=ch;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowelsCount2++;
			}
		}
		
		//System.out.println(res2);
		//System.out.println(res1);
		
		//System.out.println(vowelsCount2);
		return vowelsCount1==vowelsCount2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getResult("mars"));

	}

}
