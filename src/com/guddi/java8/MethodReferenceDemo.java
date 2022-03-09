package com.guddi.java8;

//Alternate to Lambda expression

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for code re-usability Method referencing
		//using a :: you can reference a method of class
		FunctionalInterfaceDemo functionalInterfaceDemo= Test :: testImplementation;
		functionalInterfaceDemo.singleAbsMethod();
		
		//If no Implementation is available in existing code base --> follow code for lambda expression
//		FunctionalInterfaceDemo f= ()->System.out.println("inplementation");
//		f.singleAbsMethod();
	}

}

class Test{
	
	public static void testImplementation() {
		System.out.println("This is a test implementation of your abstract method");
	}
}
