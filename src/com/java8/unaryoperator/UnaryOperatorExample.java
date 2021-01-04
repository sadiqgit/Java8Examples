package com.java8.unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 
 * @FunctionalInterface
 * public interface unaaryOperator<T> extends Function<T,T>{
 * 
 * }
 *
 *In Java 8, UnaryOperator is a functional interface and it extends Function.
 *
 *In this example, the Function<Integer, Integer> which accepts and returns the same type, 
 *can be replaced with UnaryOperator<Integer>.
 */

public class UnaryOperatorExample {

	public static void main(String[] args) {

		Function<Integer, Integer> function = x -> x * 2;

		function.apply(2); // 4

		UnaryOperator<Integer> unaryOperator = x -> x * 2;

		unaryOperator.apply(2); // 4

	}
}
