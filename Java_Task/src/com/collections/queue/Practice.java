package com.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice {

	public static void main(String[] args) {
		//Queue<Integer> q=new LinkedList<>();
		//q.add(1);
		List<Integer>q2=new LinkedList<>();
		q2.addFirst(10);
		//System.out.println(q2);
		//List<Integer>q3=new ArrayList<>();
		
	
		//q2.re
		  ArrayDeque<Integer> dq = new ArrayDeque<>();
		  dq.addFirst(10);
		  dq.addFirst(122);
	        dq.addLast(20);
	        dq.addLast(30);
	        //System.out.println(dq);
		  
		  
		  

//	        q.add(30);
//	        q.add(10);
//	        q.add(20);
//	        q.poll();
//	        
//	        
//
//	        System.out.println(q);
//
//	        System.out.println(q.poll());
	       // Deque<Integer>q=new ArrayDeque<>();
	        PriorityQueue<Integer> pq =
	                new PriorityQueue<>(Collections.reverseOrder());

	            pq.add(10);
	            pq.add(30);
	            pq.add(20);

	            while(!pq.isEmpty()) {
	                System.out.println(pq.poll());
	            }
	        

	}

}
