package com.task.inheritance;
import java.util.Scanner;
public class AmstrongNumber {
	public int getCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public int getPower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public boolean isAmstrong(int num) {
		int count=getCount(num);
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+getPower(rem,count);
			num/=10;
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		AmstrongNumber a=new AmstrongNumber();
		if(a.isAmstrong(num)){
			System.out.println(num+"is amstrong number");
			
		}
		else {
			System.out.println(num+"it is not amstrong number");
		}
		

	}

}
