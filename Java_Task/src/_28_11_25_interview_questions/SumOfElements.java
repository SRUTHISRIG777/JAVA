package _28_11_25_interview_questions;

public class SumOfElements {
	public void getSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,100};
		new SumOfElements().getSum(arr);

	}

}
