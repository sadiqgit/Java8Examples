package com.java8.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.filterAppleswithlambdas.Apple;

public class SortCustomMap {
	
	public static void main (String[] args) {
		
		Apple apple = new Apple();

		apple.setColour("green");
		apple.setWeight(100);

		Apple apple1 = new Apple();

		apple1.setColour("red");
		apple1.setWeight(200);

		Apple apple2 = new Apple();

		apple2.setColour("green");
		apple2.setWeight(250);
		
		Map<Integer,Apple> map = new HashMap<>();
		
		map.put(1,apple);
		map.put(2,apple1);
		map.put(3,apple2);
		
		// sort apples by color
		
		LinkedHashMap<Integer,Apple> result = map.entrySet().stream()
		.sorted(Map.Entry.<Integer,Apple>comparingByValue((o1,o2) -> o1.getColour().compareToIgnoreCase(o2.getColour())))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap<Integer, Apple>::new));
		
		System.out.println(result);
		
		
		
	}

}
