package com.java8.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


/**
 * 
 * @FunctionalInterface
 * public interface BinaryOperator<T> extends Function<T,T,T>{
 * 
 * }
 *
 *In Java 8, BinaryOperator is a functional interface and it extends BiFunction.
 *
 *In this example, the BiFunction<Integer, Integer, Integer> which accepts 
 *and returns the same type, can be replaced with BinaryOperator<Integer>.
 *
 */

public class BinaryOperatorExample {
	
	public static void main (String[] args) {
		
		BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x+y;
		
		System.out.println(biFunction.apply(2, 3)); //5
		
		BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
		
		System.out.println(binaryOperator.apply(2, 3)); //5
		
		
		
		
	}

}
