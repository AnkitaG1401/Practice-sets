package com.guddi.java8;

public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{

	//Solution of diamond problem : InterfaceName.super.methodName()
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DiamondProblemInterface1.super.m1();
	}
	
	public static void main(String[] args) {
		DiamondProblemClass default1=new DiamondProblemClass();
		default1.m1();
	}

}
