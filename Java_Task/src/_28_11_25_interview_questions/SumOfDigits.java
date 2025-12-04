package _28_11_25_interview_questions;

public class SumOfDigits {
	public void getSum(int num) {
		int sum=0;
		while(num!=0) {
			int remainder=num%10;
			sum+=remainder;
			num/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumOfDigits().getSum(134);

	}

}
