package com.guddi.java8;

import java.util.function.BiConsumer;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lambda expressions are actually referenced by a Functional Interface
		//BiConsumer is a functional interface with accept method.
		BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
		biConsumer.accept(10,2);
	}

}
