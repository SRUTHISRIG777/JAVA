package com.arrays.task2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingElement {
	public static int findPosition(int[] arr,int index) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==index) {
				return i+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=UtilityArray.getData();
		System.out.println(Arrays.toString(arr));
		System.out.println("enter element to search:");
		int index=sc.nextInt();
		if(findPosition(arr,index)!=0) {
			System.out.println("element found at position:"+findPosition(arr,index));
		}
		else {
			System.out.println("not founded");
		}

	}

}
