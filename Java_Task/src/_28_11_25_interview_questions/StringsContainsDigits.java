package _28_11_25_interview_questions;

public class StringsContainsDigits {
	public boolean isDigit(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9'){
				return true;
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=new StringsContainsDigits().isDigit("123@75325");
		System.out.println(res);

	}

}
