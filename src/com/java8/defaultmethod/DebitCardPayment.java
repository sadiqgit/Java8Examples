package com.java8.defaultmethod;

public class DebitCardPayment implements Payment {
	
	@Override
	public void pay() {
	 System.out.println("DebitCardPayment implementation");
	}

}
