package _28_11_25_interview_questions;

public class ConvertingString {
	public void getString(String str) {
		String res="";
		//a=97 z=122
		//A=65 Z=90
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				res+=Character.toUpperCase(ch);
			}
			else if(ch>='A'&&ch<='Z') {
				res+=Character.toLowerCase(ch);
			}
			else {
				res+=ch;
			}
			
			
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		new ConvertingString().getString("Hello");
		

	}

}
