package com.java8.staticMethodInInterface;

public class Test {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		
		car.changeGear();
		car.speedUp();
		// call to static method in an interface
		double speed = Vehicle.getSpeedInKMH(60, 2);
		
		System.out.println("speed of the car in KMH is: " +speed);
	}

}
