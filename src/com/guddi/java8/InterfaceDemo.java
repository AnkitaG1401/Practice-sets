package com.guddi.java8;

public interface InterfaceDemo {

	//this gives error in Implementing classes
//	void printNameABC();
	
	//Since it is default method, implementation of this method is not compulsory in implementing classes
	//Also, default is not an access modifier here
	//In interfaces, the methods are by default public
	default void printName() {
		System.out.println("Welcome");
	}
}
