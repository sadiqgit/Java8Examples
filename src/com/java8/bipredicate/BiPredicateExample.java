package com.java8.bipredicate;

import java.util.function.BiPredicate;

/**
 * 
 * @FunctionalInterface
 * public interface BiPredicate<T,U> {
 *  boolean test (T t, U u);
 * }
 *
 *In Java 8, BiPredicate is a functional interface, which accepts two arguments and returns a boolean,
 * basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.
 * 
 */

public class BiPredicateExample {
	
	public static void main (String[] args) {
		
		BiPredicate<Integer, Integer> bipredicate = (x,y) -> x >y;
		
		System.out.println(bipredicate.test(5, 3));
	}

}
