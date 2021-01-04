package com.java8.bifunction;

import java.util.function.BiFunction;

/**
 * 
 * @FunctionalInterface
 * public interface BiFunction<T,U,R>{
 * R apply(T t, U u);
 * 
 * }
 *
 *In Java 8, BiFunction is a functional interface; 
 *it takes two arguments and returns an object.
 *
 */

public class BiFunctionExample {
	
	public static void main(String[] args) {
		
		
		BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> (x+y);
		
		System.out.println(biFunction.apply(2, 3));
	}

}
