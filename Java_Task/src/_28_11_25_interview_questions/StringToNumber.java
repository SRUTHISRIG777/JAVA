package _28_11_25_interview_questions;

public class StringToNumber {
	public void getNumber(String str) {
		int res=0;//123
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//48 to ....
			res=(res*10)+ch-48;//
			
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new StringToNumber().getNumber("123");
	}

}
