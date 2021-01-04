package com.java8.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * For primitive types like int,long, double etc. Java 8 provided related
 * flatMap{primitiveType} methods to flat the stream of primitive type.
 * 
 * Example: flatMapToInt -> IntStream
 *
 */

public class FlatMapWithPrimitiveType {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		
		Stream<int[]> intArrayStream = Stream.of(array);

		// Stream<int[]> -> flatMap -> IntStream
		
		IntStream intStream = intArrayStream.flatMapToInt( x -> Arrays.stream(x));

		intStream.forEach(x -> System.out.println(x));

	}

}
