package com.java8.stream;

import java.util.stream.Stream;

/**
 * 
 * In Java 8, we can use Stream.iterate to create stream values on demand, so called infinite stream.
 * 
 *
 */

public class StreamIterateExample {
	
	public static void main (String args[]) {
		
		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));
		
		// Streams of odd numbers only
		
		Stream.iterate(0, n -> n +1)
		.filter(x -> x % 2 != 0)
		.limit(10)
		.forEach(x -> System.out.println(x));
	}

}
