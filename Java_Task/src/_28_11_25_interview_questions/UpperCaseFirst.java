package _28_11_25_interview_questions;

public class UpperCaseFirst {
	public void getString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z') { //97-122 65-90
				res+=ch;//ON
			}
			
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//NumberOne
			if(ch>='a'&&ch<='z') {
				res+=ch;//ONum
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpperCaseFirst().getString("NumberOne");

	}

}
//NumberOne
//ONumber
