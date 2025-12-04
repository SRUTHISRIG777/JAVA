package _28_11_25_interview_questions;

public class CountCharacter {
	public void getCount(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountCharacter().getCount("sruuuuuuu uthi", 'u');

	}

}
