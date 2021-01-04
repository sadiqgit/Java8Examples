package com.java8.filterAppleswithlambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

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

		List<Apple> greenApples = apples.stream().filter(a -> a.getColour().equalsIgnoreCase("green")).collect(Collectors.toList());
		                         
		List<Apple> heavyGreenApples = apples.stream().filter(a -> a.getColour().equalsIgnoreCase("green") && (a.getWeight() > 150)).collect(Collectors.toList());
		
		List<Apple> applesSortByWeight = apples.stream().sorted((o1,o2) -> o1.getWeight() - o2.getWeight()).collect(Collectors.toList());
		
		System.out.println("Green Apples are : " + greenApples);
		
		System.out.println("Heavy Green Apples are : " + heavyGreenApples);
		
		System.out.println("applesSortByWeight" + applesSortByWeight);

		
	}
}
