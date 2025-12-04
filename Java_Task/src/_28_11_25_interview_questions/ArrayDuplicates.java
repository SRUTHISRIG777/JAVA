package _28_11_25_interview_questions;

public class ArrayDuplicates {
	public void getArray(int[] arr) {
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			boolean found=false;
			for(int j=0;j<index;j++) {
				if(arr[i]==arr1[j]) {
					found=true;
					break;
				}
			}
			if(!found) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++) {
			System.out.println(arr1[i]);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,2,3};
		new ArrayDuplicates().getArray(arr);

	}

}
