package com.java8.defaultmethodWithMutipleInheritance;

/**
 * 
 * @author Sadiq
 *
 *This code without override default method(s) will fail to compile
 *
 */

public class ClassA implements InterfaceA, InterfaceB {

	@Override
	public void foo() {
		
		// if we need to call InterfaceA foo method
		
		InterfaceA.super.foo();

	}
	
}
