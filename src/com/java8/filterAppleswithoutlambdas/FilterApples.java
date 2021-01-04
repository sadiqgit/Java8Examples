package com.java8.filterAppleswithoutlambdas;

import java.util.ArrayList;
import java.util.List;

public class FilterApples {

	public static List<Apple> filterApplesByColour(List<Apple> apples,String colour) {
		
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : apples) {
			
			if(apple.getColour().equalsIgnoreCase(colour)) {
				
				result.add(apple);
				
			}
		}
		
		return result;
		
	}
	
public static List<Apple> filterApplesByWeight(List<Apple> apples,int weight) {
	
		// duplicate code
		List<Apple> result = new ArrayList<>();
	
		for(Apple apple : apples) {
			
			if(apple.getWeight() > weight) {
				
				result.add(apple);
				
			}
		}
		
		return result;
		
	} 
}


