package com.java8.staticMethodInInterface;

public interface Vehicle {
	
	void speedUp();
	
	void changeGear();
	
	static double getSpeedInKMH(double distance, double hours) {
		
		return distance/hours;
		
	}

}
