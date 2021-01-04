package com.java8.consumer;

import java.util.function.Consumer;

/**
 * 
 * Consumer is a functional interface which takes an argument and returns nothing.
 * 
 * @FunctionalInterface
 * public interface Consumer<T> {
 * 
 * void accept ( T t);  
 * 
 * }
 *
 */

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> consumer = x -> System.out.println(x);
		
		consumer.accept("Java8");
			
	}

}
