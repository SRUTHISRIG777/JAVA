package _28_11_25_interview_questions;

public class Factorial {
	public void getFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		
             new Factorial().getFactorial(4);
	}

}
