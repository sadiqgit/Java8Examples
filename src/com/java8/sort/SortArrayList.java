package com.java8.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {
	
	public static void main (String[] args) {
		
		// how to sort a List with stream.sorted()
		
		List<String> names = Arrays.asList("sadiq", "mannu", "khader", "usman");
		
		/*
		 * List<String> sortedNames = names.stream().sorted((o1,o2) ->
		 * o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
		 * 
		 * List<String> sortedNames =
		 * names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
		 * ;
		 */
		
		names.stream().sorted().collect(Collectors.toList()).stream().forEach((o1) -> System.out.println(o1));
		
	} 

}