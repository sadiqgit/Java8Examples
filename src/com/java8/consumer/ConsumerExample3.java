package com.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * Print the name and length of name from the list using consumers
 * 
 * 
 *
 */

public class ConsumerExample3 {

	public static void main(String args[]) {

		List<String> list = new ArrayList<String>();
		list.add("sannu");
		list.add("Mannu");
		list.add("danish");

		// Consumer to display a list of names
		Consumer<List<String>> printNames = nameList -> list.stream().forEach(a -> System.out.print(a + " "));

		// Consumer to display a length of names
		Consumer<List<String>> namesLength = lengthList -> list.stream().forEach(a -> System.out.print(a.length() + " "));

		// using addThen()
		printNames.andThen(namesLength).accept(list);

	}
}
