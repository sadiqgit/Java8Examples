package com.java8.flatmap;

import java.math.BigDecimal;
import java.util.List;

public class Order {
	
	private  Integer OrderId;
	
	private List<OrderItem> orderItems;
	
	private BigDecimal total;
	
	

	public Order(Integer orderId, List<OrderItem> orderItems, BigDecimal total) {
		
		OrderId = orderId;
		this.orderItems = orderItems;
		this.total = total;
	}

	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", orderItems=" + orderItems + ", total=" + total + "]";
	}
	
}
