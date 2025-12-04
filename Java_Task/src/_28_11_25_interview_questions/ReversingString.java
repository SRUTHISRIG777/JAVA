package _28_11_25_interview_questions;

public class ReversingString {
	public void getString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res+=ch;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReversingString().getString("Hellooooo");

	}

}
