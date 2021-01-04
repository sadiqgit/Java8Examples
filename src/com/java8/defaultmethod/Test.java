package com.java8.defaultmethod;

public class Test {
	
	public static void main(String[] args) {
		
		Payment debitCardpayment =   new DebitCardPayment();
		
		Payment creditCardPayment =   new CreditCardPayment();
		
		Payment cashOnDeliveryPayment =   new CashOnDeliveryPayment();
		
		debitCardpayment.pay();
		creditCardPayment.pay();
		cashOnDeliveryPayment.pay();
		
	}

}
