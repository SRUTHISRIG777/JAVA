package _28_11_25_interview_questions;

public class SecondLargestElement {
	public void getSecondLargest(int[] arr) {
		int max=Integer.MIN_VALUE;//9
		int max2=Integer.MIN_VALUE;//9
		for(int i=0;i<arr.length;i++) {//[1,2,3,4,5]
			
			if(max<arr[i]) {
				max=arr[i];//5
			}
			
		}
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<max && arr[i]>max2) {
			max2=arr[i];
		}
		}
		System.out.println(max2);
	}

	public static void main(String[] args) {
		 SecondLargestElement obj=new  SecondLargestElement();
		 int[] arr= {-10, -3, -20, -5};

;
		 obj.getSecondLargest(arr);
		

	}

}
