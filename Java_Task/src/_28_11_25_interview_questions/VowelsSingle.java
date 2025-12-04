package _28_11_25_interview_questions;

public class VowelsSingle {
	public void printVowels(String str) {
		char[] ch=str.toCharArray();
		String res="";
		boolean a=false,e=false,i=false,o=false,u=false;
		for(int j=0;j<str.length();j++) {
			if(ch[j]=='a'||ch[j]=='A') {
				if(!a) {
					res+=ch[j];
					a=true;
				}
			}
			else if(ch[j]=='e'||ch[j]=='E') {
				if(!e) {
					res+=ch[j];
					e=true;
				}
			}
			
		
			else if(ch[j]=='i'||ch[j]=='I') {
				if(!i) {
					res+=ch[j];
					i=true;
				}
				
			}
			else if(ch[j]=='o'||ch[j]=='O') {
				if(!o) {
					res+=ch[j];
					o=true;
				}
				
			}
			else if(ch[j]=='u'||ch[j]=='U') {
				if(!u) {
					res+=ch[j];
					u=true;
				}
				
			}
			
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		new VowelsSingle().printVowels("helAlaooo");
		

	}

}
