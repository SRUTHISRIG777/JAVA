package _28_11_25_interview_questions;

public class SumOfMiddleDigits {
	public void getSum(int num) {
		//75547
		int sum=0;
		int temp=num;
		
		int lastDigit=temp%10;//7
		temp/=10;//7554
		while(temp>9) {
			int rem=temp%10;//5
			sum+=rem;//9//14
			temp/=10;//75//7
			
		}
		if(sum==(temp+lastDigit)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumOfMiddleDigits().getSum(1212);

	}

}
