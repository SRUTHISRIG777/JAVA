package com.arrays.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
    public static boolean isPalindrome(int n) {
    	int temp=n;
    	int sum=0;
    	while(n>0) {
    		int rem=n%10;
    		sum=sum*10+rem;
    		n/=10;
    	}
    	return sum==temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter size");
//       int size=sc.nextInt();
//      sc.nextLine();
//       if(size<=0||size>10) {
//    	   System.out.println("invalid");
//       }
//       else {
//    	   String[] arr=new String[size];
//    	   for(int i=0;i<size;i++) {
//    		   
//    		   System.out .println("enter element:"+(i+1));
//    		   
//    		   arr[i]=sc.nextLine();
//    		   
//    		   
//    	   }
//    	   System.out.println(Arrays.toString(arr));
//       }
		
		int[] arr=UtilityArray.getData();
		for(int n:arr) {
			if(isPalindrome(n)) {
				System.out.println(n);
			}
		}
//		String[] str=UtilityArray.getResult();
//		System.out.println(Arrays.toString(str));
		
		
	}

}
