package _28_11_25_interview_questions;

public class StringPalindrome {
	public boolean isPalindrome(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res+=ch;
		}
		if(str.equals(res)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=new StringPalindrome().isPalindrome("man");
		System.out.println(result);

	}

}
