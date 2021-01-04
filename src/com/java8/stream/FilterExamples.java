package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Filter and collect examples
 *
 */

public class FilterExamples {
	
	public static void main (String[] args) {
		
		List<String> technologies = Arrays.asList("Java","Scala","Kotlin", "Groovy", "C++");
		
		// get the technologies which doesn't contain c++
		
		List<String> technologiesWithoutCPlusPlus = technologies.stream().filter(x -> !x.equalsIgnoreCase("C++")).collect(Collectors.toList());
		
		technologiesWithoutCPlusPlus.forEach(x-> System.out.println(x));
		
	}

}
