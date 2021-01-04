package com.java8.reduce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.java8.flatmap.OrderItem;

public class ReduceExample2 {
	
	public static void main (String[] args) {
		
		// A simple example to calculate the total price of the order items in the cart
		
		OrderItem item1 = new OrderItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        OrderItem item2 = new OrderItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        
        orderItems.add(item1);
        orderItems.add(item2);
        
        // sum bigdecimal using stream
        BigDecimal sum = orderItems.stream().map(x -> x.getTotal())
        		          .reduce(BigDecimal.ZERO,BigDecimal::add);
        
        System.out.println("Total price of all the products in the cart is :" +sum);
       
	}

}
