package com.java8.biconsumer;

import java.util.HashMap;
import java.util.Map;

public class JavaMapBiConsumer {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Hyderabad");
		map.put(2, "Chennai");
		map.put(3, "Banglore");
		map.put(4, "Pune");
		
		map.forEach((k,v)->System.out.println(k + ":" +v));

	}
}
