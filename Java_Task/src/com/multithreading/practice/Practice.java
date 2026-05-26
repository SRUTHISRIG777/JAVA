package com.multithreading.practice;


//class Thread2 implements Runnable{
//	@Override 
//	public void run() {
//		System.out.println("thread 2");
//	}
//}
class Counter{
	int count=0;
 void increament() {
		count++;
	}
}
class MyThread extends Thread{
	Counter c;
	MyThread(Counter c){
		this.c=c;
		
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			c.increament();
			System.out.println(c.count);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}


public class Practice {

	public static void main(String[] args) {
//		MyThread t1=new MyThread();
//		t1.start();
//		Thread2 t2=new Thread2();
//		t2.run();
//		Thread t3=new Thread(t2);
//		t3.start();
//		for(int i=0;i<5;i++) {
//			System.out.println(i);
//			try {
//				t3.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//		
//		MyThread t1=new MyThread();
//		t1.start();
//		try {
//			t1.join();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		//t1.join();
//		System.out.println("main thread strated");
		
       Counter c=new Counter();
       //c.increament();
       MyThread t1=new MyThread(c);
       MyThread t2=new MyThread(c);
       t1.start();
       t2.start();
       try {
           t1.join();
           t2.join();
       }
       catch(Exception e) {
           System.out.println(e);
       }
       System.out.println(c.count);
       
       
       
	}

}
