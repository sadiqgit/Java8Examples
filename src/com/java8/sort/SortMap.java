package com.java8.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * 1. Convert Map into stream < map.emtrySet.stream() >
 * 2. Sort it
 * 3. Collect and return the new LinkedHashMap (Keep the order)
 *
 */

public class SortMap {

	public static void main(String[] args) {
		
		
		Map<String,Integer> wordCount = new HashMap<String,Integer>();
		
		wordCount.put("x",21);
		wordCount.put("y",2);
		wordCount.put("a",11);
		wordCount.put("g",34);
		wordCount.put("c",22);
		wordCount.put("r",12);
		wordCount.put("u",14);
		wordCount.put("i",18);
		wordCount.put("o",31);
		wordCount.put("p",21);
		wordCount.put("h",15);
		wordCount.put("k",33);
		
		// sort map with key
		
		LinkedHashMap<String, Integer> result = wordCount.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(result);
		
		// sort map with value
		
		LinkedHashMap<String, Integer> result1 =wordCount.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(result1);

	}

}
