package _28_11_25_interview_questions;

public class RversingNumber {
	public void getRversedNumber(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		new RversingNumber().getRversedNumber(123);
	}

}
