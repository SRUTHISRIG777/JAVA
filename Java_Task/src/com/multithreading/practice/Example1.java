package com.multithreading.practice;

import java.util.Arrays;
//

class Producer implements Runnable{
	StringBuffer bf;
	Producer(){
		this.bf=new StringBuffer();
	}
	public void run() {
		try {
		synchronized (bf) {
			for(int i=0;i<=5;i++) {
				bf.append(i);
				System.out.println(bf);
				Thread.sleep(2000);
				
			}
			bf.notify();
			
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
class Consumer implements Runnable{
	Producer pro;
	Consumer(Producer pro){
		this.pro=pro;
	}
	public void run() {
					
			try {
				synchronized (pro.bf) {

				System.out.println("i am waiting for data from producer");
				pro.bf.wait();
				System.out.println("i am consuming the data");
				System.out.println(pro.bf);
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}


public class Example1 {
	

	public static void main(String[] args) {
		Producer pro=new Producer();
		Consumer c=new Consumer(pro);
		Thread th1=new Thread(pro);
		Thread th2=new Thread(c);
		th2.start();
		th1.start();
		

	}

}
