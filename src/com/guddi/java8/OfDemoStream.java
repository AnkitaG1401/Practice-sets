package com.guddi.java8;

import java.util.stream.Stream;

//Of() method can take any group of values and convert them into Stream
public class OfDemoStream {

	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,11111).forEach(x-> System.out.println(x));
		
		String[] name = {"Python","Java","Coding"};
		Stream.of(name).filter(x->x.length()>=5).forEach(x->System.out.println(x));
	}
}
