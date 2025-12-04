package _28_11_25_interview_questions;

public class MiddleCharacter {
	public void getMiddle(String str) {
		int len=str.length();
		String str1="";
		//wonde
		char  mid=' ';
		if(len%2==0) {
			mid=str.charAt((len/2)-1);//n
			str1=str1+mid+str.charAt(len/2);//d
			
			
		}
		else {
			str1+=str.charAt(len/2);
		}
		System.out.println(str1);
	}
	

	public static void main(String[] args) {
		new MiddleCharacter().getMiddle("sruthisri");
		

	}

}
