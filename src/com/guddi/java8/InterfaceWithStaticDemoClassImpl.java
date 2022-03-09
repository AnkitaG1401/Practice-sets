package com.guddi.java8;

public class InterfaceWithStaticDemoClassImpl implements InterfaceWithStaticDemo{

	public static void main(String[] args) {
		//Static methods visibility is only to interface/class not available to child classes
		
		//below code gives error
//		InterfaceWithStaticDemoClassImpl classImpl=new InterfaceWithStaticDemoClassImpl();
//		classImpl.taticMethod();
		InterfaceWithStaticDemo.staticMethod();
	}
	
}
