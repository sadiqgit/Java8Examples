package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample1 {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> sum = (x, y) -> System.out.println(x + y);

		BiConsumer<String, String> string = (x, y) -> System.out.println(x + y);

		sum.accept(1, 2);
		string.accept("Node", ".js");
	}

}