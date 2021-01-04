package com.java8.filterAppleswithoutlambdas;

import java.util.ArrayList;
import java.util.List;

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

		List<Apple> greenApples = FilterApples.filterApplesByColour(apples, "green");

		List<Apple> heavyApples = FilterApples.filterApplesByWeight(apples, 200);

		for (Apple greenApple : greenApples) {

			System.out.println("Green Apples are : " + greenApple);
		}

		for (Apple heavyApple : heavyApples) {

			System.out.println("Heavy Apples are : " + heavyApple);
		}
	}
}
