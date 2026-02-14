package com.example;

//import java.util.HashMap;
//import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		int[] arr= {1,2,2,1,3,3,3,4,2};
		int val=-1;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
		
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>max) {
				max=count;
				val=arr[i];
				
			}
			
			

	}
		System.out.println(val);

}
}
