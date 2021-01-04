package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 15, 56, 34, 3, 5, 7);

		List<Integer> numbersGreaterthanTen = numbers.stream().filter(x -> x > 10).collect(Collectors.toList());

		numbersGreaterthanTen.forEach(x -> System.out.println(x));

	}

}
