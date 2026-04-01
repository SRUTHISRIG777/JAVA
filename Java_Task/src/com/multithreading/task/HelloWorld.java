package com.multithreading.task;

public class HelloWorld {

	public static void main(String[] args) {
		Runnable hello=new Runnable() {
			public void run() {
				System.out.println("hello");
			}
			
		};
		Runnable world=()->{
			System.out.println("world");
		};
		Thread th1=new Thread(hello);
		Thread th2=new Thread(world);
		try {
			th1.start();
			th1.join();
			th2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
