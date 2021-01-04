package com.java8.reduce;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Stream.reduce() combine elements of a stream and produces a single value.
 *
 */

public class ReduceExample {
	
	public static void main (String[] args) {
		
		// A simple sum program
		
		int sum =0;
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for (Integer number : numbers) {
			 sum = sum + number;
		}
		
		System.out.println("sum of numbers is :" +sum);
		
		// sum of elements in java 8 using reduce
		
		int sumOfNumbers = numbers.stream().reduce(0,Integer::sum);
		
		System.out.println("sumOfNumbers using java 8 reduce: " +sumOfNumbers );
		
		// min amd max
		
		int max = numbers.stream().reduce(0,Integer::max);
		
		System.out.println("max value is :" +max);
		
		int min = numbers.stream().reduce(0, Integer::min);
		
		System.out.println("min value is :" +min);
		
	}
}