package _28_11_25_interview_questions;

public class BetweenDigits {
	public boolean isLess(int num) {
		//num=96728
		int temp1=num;//96727
		
		int lastDigit=temp1%10;//7
		int firstDigit=0;
		int digits=0;
		temp1/=10;//9672
		int temp2=temp1;//9672
		while(temp1>9) {
		temp1/=10;//9
		}
		firstDigit=temp1;//9
//		System.out.println(firstDigit);
//		System.out.println(lastDigit);
		while(temp2>9) {//9672
			digits=temp2%10;//7
			if(digits>=firstDigit || digits>=lastDigit) {
				return false;
			}
			temp2/=10;//967
		}
		return true;
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		boolean result=new BetweenDigits().isLess(841029);
		System.out.println(result);
		//new BetweenDigits().isLess(1234);
	     

	}

}
