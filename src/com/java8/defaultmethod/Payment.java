package com.java8.defaultmethod;

public interface Payment {
	
	default void pay() {
		System.out.println("default payment implementation");
	}
}
