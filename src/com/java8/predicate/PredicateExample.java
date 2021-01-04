package com.java8.predicate;

import java.util.function.Predicate;

/**
 * 
 * @FunctionalInterface
 * public interface Predicate<T> {
 * 
 * boolean test(T t);
 * 
 * }
 *
 */

public class PredicateExample {
	
	public static void main ( String[] args) {
		
		Predicate<Integer> predicate = x -> x > 5;
		
		System.out.println(predicate.test(3));
		
	}

}
