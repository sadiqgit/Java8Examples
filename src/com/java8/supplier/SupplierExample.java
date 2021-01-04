package com.java8.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/**
 * 
 * @FunctionalInterface
 * public interface Supplier<T>{
 * 
 * T get();
 *
 * This example refers to the suppler to get the current date and time
 */

public class SupplierExample {
	
	public static void main(String[] args) {
		
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();
		
		System.out.println(currentTime.get());
		
		Supplier<String> currentDate = () -> dtf.format(LocalDate.now());
		
		System.out.println(currentDate.get());
	}
	
	

}
