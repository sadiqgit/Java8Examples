package com.java8.function;

import java.util.function.Function;

/**
 * 
 * @FunctionalInterface
 *public interface Function<T,R>{
 *
 * R apply( T t);
 *}
 *
 * In Java 8, Function is a functional interface; 
 * it takes an argument (object of type T) and returns an object (object of type R). 
 * The argument and output can be a different type.
 * 
 *  This example takes a <T> String and returns the length of the string as <R> Integer.
 */

public class FunctionExample {
	
	public static void main(String[] args) {
		
		Function<String,Integer> function = x -> x.length();
		
		System.out.println(function.apply("Sadiq"));
	}

}
