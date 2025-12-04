package _28_11_25_interview_questions;

public class RemoveVowels {
	public void getString(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
				res+=ch;
				
			}
			
		} 
		System.out.println("string after removing vowels: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveVowels().getString("Hello World");

	}

}
