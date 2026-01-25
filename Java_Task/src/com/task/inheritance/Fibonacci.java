package com.task.inheritance;
import java.util.Scanner;
public class Fibonacci {
	public void fibonacciSeries(int series) {
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		while(true) {
			int next=first+second;
			if(next>series) {
				break;
			}
			System.out.println(next);
			first=second;
			second=next;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter series");
		int series=sc.nextInt();
		Fibonacci f=new Fibonacci();
		f.fibonacciSeries(series);

	}

}
