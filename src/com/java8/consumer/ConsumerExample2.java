package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
		
	    forEach(list,consumer);
	    
	    List<String> names = Arrays.asList("sadiq","khader","mannu");
	    
	    // for each is flexible
	    
	    forEach(names,  x -> System.out.println(x.length())); 
		
	}
	
	
	static <T> void forEach (List<T> list, Consumer<T> consumer) {
		
		for ( T t : list) {
			
			consumer.accept(t);
		}
	}

}
