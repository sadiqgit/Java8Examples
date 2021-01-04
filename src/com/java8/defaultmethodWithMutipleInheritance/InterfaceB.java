package com.java8.defaultmethodWithMutipleInheritance;

public interface InterfaceB {
	
	default void foo() {
	
		System.out.println("Default implementation of foo in interface B");
	}

}
