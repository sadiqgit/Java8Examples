package com.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Examples of filter,findAny and orElse
 *
 */

public class FilterExample2 {
	
	public static void main (String[] args) {
		
		
		List<Student> students = Arrays.asList(new Student("Sadiq", 20),
				      new Student("Mannu",19),
				      new Student("Khader",23),
				      new Student("Sohail", 20));

		// Get the student of age 20 or else return null

		Student student = students.stream().filter(x -> x.getAge() == 20).findAny().orElse(null);
		
		System.out.println(student);
		
		// Get the student with name sohail and age 20
		
		Student student1 = students.stream().filter(x -> x.getName().equalsIgnoreCase("Sohail") && x.getAge() == 20).findAny().orElse(null);

		System.out.println(student1);
		
		// Get the student with name khader and age 19

		Student student2 = students.stream().filter(x -> x.getName().equalsIgnoreCase("Khader") && x.getAge() == 19).findAny().orElse(null);

		System.out.println(student2);
	}

}
