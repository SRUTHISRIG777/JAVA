package com.collections.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Example1 {

	public static void main(String[] args) {
	 
		PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
		q.add(10);
		q.add(5);
		
		System.out.println(q);
		Object[] arr=q.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
