package _28_11_25_interview_questions;

public class CountVowels {
	public void getCount(String str) {
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.println("vowel count: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountVowels().getCount("HelloWOrld");

	}

}
