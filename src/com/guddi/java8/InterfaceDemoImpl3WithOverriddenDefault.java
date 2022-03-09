package com.guddi.java8;

public class InterfaceDemoImpl3WithOverriddenDefault {

	//default method of interface is overridden
	public void printName() {
		System.out.println("Welcome to the overridden version");
	}
	
	public static void main(String[] args) {
		InterfaceDemoImpl3WithOverriddenDefault default1=new InterfaceDemoImpl3WithOverriddenDefault();
		default1.printName();
	}
}
