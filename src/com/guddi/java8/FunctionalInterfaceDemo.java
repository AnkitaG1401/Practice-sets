package com.guddi.java8;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	//Functional interface has only one Abstract method
	//can have multiple default static methods
	//Predefined Functional interfaces are present, also can create by own
	void singleAbsMethod();
	
	default void printName() {
		System.out.println("Welcome");
	}

	default void printName2() {
		System.out.println("Welcome");
	}
}
