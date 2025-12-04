package _28_11_25_interview_questions;

public class SumOfEvenNumbers {

	public void getSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,6,3,10};
		new SumOfEvenNumbers().getSum(arr);

	}

}
