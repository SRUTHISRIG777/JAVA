package com.collections.iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
//		List<Integer>li=Arrays.asList(10,20,30);
//		Iterator<Integer>it=li.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//System.out.println(list);
		//Iterator<Integer>it=list.iterator();
		
		ListIterator<Integer>it=list.listIterator();
		//forward
		System.out.println("forward direction");
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//backward
        System.out.println("backward direction");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		LinkedList<Integer>list1=new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		Iterator<Integer>it1=list1.iterator();
		System.out.println("iterator for liked list forward direction");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("listerator ");
		ListIterator<Integer>it2=list1.listIterator();
		//forward
		System.out.println("forward");
		while(it2.hasNext()) {
			System.out.println(it2.nextIndex()+"   "+it2.next());
		}
//		System.out.println("backward");
//		while(it2.hasPrevious()) {
//			System.out.println(it2.previous());
//		}
		

	}

}
