package com.java8.flatmap;

import java.math.BigDecimal;

public class OrderItem {
	
	private Integer id;
	
	private String item;
	
	private Integer quantity;
	
	private BigDecimal price;
	
	private BigDecimal total;
	
	

	public OrderItem(Integer id, String item, Integer quantity, BigDecimal price, BigDecimal total) {
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", item=" + item + ", quantity=" + quantity + ", price=" + price + ", total="
				+ total + "]";
	}
	
	

}
