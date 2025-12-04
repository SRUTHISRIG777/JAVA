package _28_11_25_interview_questions;

public class RemoveDuplicates {
	public void printData(String str) {//hello
		int[] freq=new int[256];
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
				freq[ch]++;
			
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(freq[ch]==1) {
				res+=ch;
			}
			
		}
		System.out.println(res);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveDuplicates().printData("MA@@%*");

	}

}
