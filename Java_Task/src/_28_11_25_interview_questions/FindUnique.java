package _28_11_25_interview_questions;

public class FindUnique {
	public void getArray(int nums[]) {
		int[] unique=new int[nums.length];
		int index=0;
		
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(i!=j && nums[i]==nums[j]) {
					count++;
				}
			}
				if(count==0) {
					unique[index]=nums[i];
					index++;
				}
			
			
		}
		
		for(int i=0;i<index;i++) {
			System.out.println(unique[i]);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,3,4,4,5};
		new FindUnique().getArray(nums);
		//int[] res=new FindUnique().getArray(nums);
//		for(int i=0;i<res.length;i++) {
//			System.out.println(res[i]);
//		}

	}

}
