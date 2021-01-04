package com.java8.function;

import java.util.function.Function;

public class ChainFunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> function = x -> x.length();

		Function<Integer, Integer> function1 = x -> x * 3;

		System.out.println(function.andThen(function1).apply("Sadiq"));

	}

}
