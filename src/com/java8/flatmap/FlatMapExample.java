package com.java8.flatmap;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * FlatMap is used to flatten a stream of collections to as stream of objects.
 * Flattening is referred to as merging multiple collections/arrays into one.
 *
 * Stream.flatMap() helps in converting Stream<Collection<T>> to Stream<T>.
 *
 */

public class FlatMapExample {
	
	public static void main (String[] args) {
		
		    OrderItem item1 = new OrderItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
	        OrderItem item2 = new OrderItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
	        Order order1 = new Order(1,  Arrays.asList(item1, item2), new BigDecimal("2.20"));

	        OrderItem item3 = new OrderItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
	        OrderItem item4 = new OrderItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
	        Order order2 = new Order(2, Arrays.asList(item3, item4), new BigDecimal("1695.00"));

	        OrderItem item5 = new OrderItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
	        Order order3 = new Order(3, Arrays.asList(item5), new BigDecimal("1497.00"));

	        List<Order> orders=  Arrays.asList(order1, order2, order3);
	        
	        // get the order items  of the order which has monitors
	        
	        // order Items is Stream<List<OrderItem> 
	        // FlatMap flattens the Stream<orderItem> to 
	        
	       /*List<OrderItem> orderItems = orders.stream().map(o -> o.getOrderItems()).flatMap(o -> o.stream()).filter(o -> o.getItem().startsWith("monitor"))
	    		   .collect(Collectors.toList());*/
	       
	       List<OrderItem> orderItems =  orders.stream().flatMap(o -> o.getOrderItems().stream()).filter(o -> o.getItem().startsWith("monitor")).collect(Collectors.toList());
	      
	      orderItems.forEach(System.out::println);
		
		
		
		
	}

}
