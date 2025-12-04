package _28_11_25_interview_questions;

public class CapitalizeFirstWord {
	public void getString(String str) {
		String res="";//res=ello W
		res+=Character.toUpperCase(str.charAt(0));//res=ello
		for(int i=1;i<str.length();i++) {//i=7
			char ch=str.charAt(i);//o
			
			if(ch==' ') {
				res+=ch;
				ch=str.charAt(i+1);//w
				ch=Character.toUpperCase(ch);//W
				res+=ch;
				i++;
			}
			else {
			res+=ch;
			}
			
			}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CapitalizeFirstWord().getString("hello world");

	}

}
