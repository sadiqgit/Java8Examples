package com.java8.staticMethodInInterface;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("speed up the car");
		
	}

	@Override
	public void changeGear() {
		System.out.println("Change gear of the car");
		
	}
	
}
