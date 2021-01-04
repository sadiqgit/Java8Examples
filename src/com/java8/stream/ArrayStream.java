package com.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		
		String[] names = {"sadiq","khader","mannu"};
		
		Stream<String> namesStream = Arrays.stream(names);
		
		// find count of names
		
		System.out.println(namesStream.count());

	}

}
