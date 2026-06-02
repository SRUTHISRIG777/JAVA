package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>list=List.of(45,78,90,35,67);
//		System.out.println(list);
//		list.stream().
//		filter(n->n%2==0).
//		forEach(System.out::println);
//		System.out.println(list);
		
		//Stream<Integer>stream=list.stream();
		//stream.filter(m->m%2!=0).forEach(System.out::println);
		//String[] names= {"sruthi","raviteja","mahi"};
		//Arrays.stream(names).forEach(System.out::println);
		List<String> cities =List.of("hyderabad","vijayawada","vizag");
		List<String> result=cities.stream().map(String::toUpperCase).filter(n->n.charAt(0)=='V').
				sorted(Comparator.reverseOrder()).
		collect(Collectors.toList());
	    System.out.println(result);
	    result.add("sweety");
	    System.out.println(result);
	    long count=result.stream().count();
	    System.out.println(count);
	    
//	    List<String> names =
//	    	    List.of("Alice","Bob","Alex","Tom");
//	    long count1=names.stream().filter(n->n.charAt(0)=='A').count();
//	    System.out.println(count1);
	    //List<Integer>l=List.of();
//	    int sum=l.stream().reduce(Integer.MIN_VALUE,(a,b)->);
//	    System.out.println(sum);
	    //System.out.println(l.stream().findFirst());
//	    Optional<Integer>r=l.stream().min(Integer::compare);
//	    System.out.println(r);
	    
	    List<String> names = List.of(
	            "john",
	            "alice",
	            "jack",
	            "bob",
	            "jane",
	            "jack"
	    );
	    List<String> r=names.stream().map(String::toUpperCase).filter(n->n.charAt(0)=='J').distinct().sorted().collect(Collectors.toList());
	    System.out.println(r);
	    
	    List<Integer> nums = List.of(10, 25, 40, 15, 60, 25, 40);
	    List<Integer>res=nums.stream().filter(n->n>20).distinct().map(n->n*2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(res);
	    

	}

}
