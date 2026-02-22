package com.arrays.task4;

public class FrequencyArray {
	public static void findFrequency(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[] freq=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println("frequency of "+i+"is:"+freq[i]);
			}
		}
	}
	public static void findFrequency1(int[] arr) {
		boolean visited[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println("frequency of"+arr[i]+"is"+count);
		}
	}

	public static void main(String[] args) {
		int [] arr= {1,2,2,3,4,5,1};
		findFrequency(arr);
	

	}

}
