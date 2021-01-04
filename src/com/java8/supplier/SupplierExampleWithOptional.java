package com.java8.supplier;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * 
 * One of the primary usage of this interface to enable deferred execution. 
 * This means delaying the execution until it is needed. For example, Optional class has a method named orElseGet. 
 * This method is triggered if optional does not have data. This is demonstrated below:
 *
 */

public class SupplierExampleWithOptional {
	
	public static void main ( String[] args) {
		
	
	Supplier<Double> doubleSupplier = () -> Math.random();
	
	Optional<Double> optional = Optional.empty();
	
	System.out.println(optional.orElseGet(doubleSupplier));
	
	}

}
