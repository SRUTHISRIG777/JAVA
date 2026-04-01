package com.multithreading.task;
class NumberPrinter implements Runnable{
	private int start;
	private int end;
	NumberPrinter(int start,int end){
		this.start=start;
		this.end=end;
	}
	
	public void run() {
		if((start&1)==0) {
			System.out.println("printing even numbers");
		for(int i=start;i<=end;i++) {
			if((i&1)==0) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(i);
			}
		}
		}
		else if((start&1)==1) {
			System.out.println("printing odd numbers");
			for(int i=start;i<=end;i++) {
				if((i&1)==1) {
					System.out.println(Thread.currentThread().getName());
					System.out.println(i);
				}
			}
			
		}
		
		
	}
}

public class PrinEvenAndOdd {
	

	public static void main(String[] args) {
		NumberPrinter n1=new NumberPrinter(2,20);
		NumberPrinter n2=new NumberPrinter(1,19);
		Thread even=new Thread(n1);
		Thread odd=new Thread(n2);
		
		try {
			even.start();
			even.join();
			odd.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
