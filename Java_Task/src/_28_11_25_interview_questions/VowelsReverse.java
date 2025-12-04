package _28_11_25_interview_questions;

public class VowelsReverse {
	public void printVowels(String str) {
		//str=str.toLowerCase();
		char[] ch=str.toCharArray();//['h','e','l','l','o']
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				res+=ch[i];
			}
		}
		System.out.println(res);
		
		
	}
	

	public static void main(String[] args) {
	       new VowelsReverse().printVowels("JackspArrow");

	}

}
