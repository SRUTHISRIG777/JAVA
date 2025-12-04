package _28_11_25_interview_questions;

public class ReversingArray {
	public void getArray(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3};
		new ReversingArray().getArray(arr);

	}

}
