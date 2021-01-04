package com.java8.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.filterAppleswithlambdas.Apple;

public class SortCustomArrayList {
	
	public static void main (String[] args) {
		
		List<Apple> apples = new ArrayList<>();

		Apple apple = new Apple();

		apple.setColour("green");
		apple.setWeight(100);

		Apple apple1 = new Apple();

		apple1.setColour("red");
		apple1.setWeight(200);

		Apple apple2 = new Apple();

		apple2.setColour("green");
		apple2.setWeight(250);

		apples.add(apple);
		apples.add(apple1);
		apples.add(apple2);
		
		// sort apples with color
		apples.stream().sorted((o1,o2) -> o1.getColour().compareToIgnoreCase(o2.getColour()))
		.collect(Collectors.toList())
		.stream().forEach(o1 -> System.out.println(o1));
		
		
		apples.stream().sorted(Comparator.comparing(Apple::getColour)).collect(Collectors.toList())
		.stream().forEach(o1 -> System.out.println(o1));
		
	}
	
}
		