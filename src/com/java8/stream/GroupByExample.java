package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
	
	public static void main (String[] args) {
		
		List<Student> students = Arrays.asList(new Student("Sadiq", 20),
			      new Student("Mannu",19),
			      new Student("Khader",23),
			      new Student("Sohail", 20),
			      new Student("Abdul", 20));
		
		// group by students with age
		Map<Integer, List<Student>> studentGroupByAge = students.stream()
				.collect(Collectors.groupingBy(Student::getAge));
		
		System.out.println(studentGroupByAge);
		
		// group by student name with age
		
		  Map<Integer,List<String>> studentNameGroupByAge = students.stream().collect(Collectors.groupingBy(Student::getAge,
				   Collectors.mapping(Student::getName, Collectors.toList())));
		  
		  System.out.println(studentNameGroupByAge);
	}

}
