package com.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
public class Task {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
 public static void main(String[] args) {
	 
	 
	 Predicate<Integer> number=num->isPrime(num);
	 System.out.println(number.test(7)?"prime":"not prime");
	 
	 Consumer<Character> charch=ch->System.out.println(isPrime(ch)?"prime":"not prime");
	 charch.accept('a');

	}

}
