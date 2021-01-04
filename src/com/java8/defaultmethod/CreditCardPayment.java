package com.java8.defaultmethod;

public class CreditCardPayment implements Payment{
	
	@Override
	public void pay() {
		 System.out.println("CreditCardPayment implementation");
		}

}
