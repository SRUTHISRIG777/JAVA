package com.arrays.task5;

public class FrequencyOfElement {
	public static void findingFrequency(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		int[] freq=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
			
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println("frequency of "+i+" is: "+freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		findingFrequency(new int[] {1,2,2,3,3,3});
		

	}

}
