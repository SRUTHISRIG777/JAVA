package _28_11_25_interview_questions;

public class SortedArray {
	public boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,2,2};
		boolean result=new SortedArray().isSorted(arr);
		System.out.println(result);

	}

}
