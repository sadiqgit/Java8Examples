package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * In Java 8, stream().map() lets you convert an object to something else
 * 
 */

public class MapExample {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Sadiq", 20), new Student("Mannu", 19),
				new Student("Khader", 23), new Student("Sohail", 20));

		// Get the student names whose age is greater than or equal to 20

		List<String> studentsWithAgeGreaterthanEqualto20 = students.stream().filter(x -> x.getAge() >= 20)
				.map(x -> x.getName()).collect(Collectors.toList());

		studentsWithAgeGreaterthanEqualto20.forEach(x -> System.out.println(x));

	}
}
