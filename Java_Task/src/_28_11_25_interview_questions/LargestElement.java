package _28_11_25_interview_questions;

public class LargestElement {
	public void getLargest(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestElement obj=new LargestElement();
		int[] arr= {0,0,0,0};
		obj.getLargest(arr);

}
}
