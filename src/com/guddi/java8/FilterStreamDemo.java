package com.guddi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(45);
		list.add(15);
		list.add(6);
		
//		Stream s = list.stream().filter(i -> i%2==0);
//		s.forEach(x ->System.out.println(x));
		
		//Normal filter
		list.stream().filter(i -> i%2==0).forEach(x ->System.out.println(x));
		
		
		//Collect Demo - collect into another list/set/any collection object
		System.out.println("Collect demo");
		List <Integer> newFilteredList = list.stream().filter(i -> i >= 20).collect(Collectors.toList());
		newFilteredList.forEach(x -> System.out.println(x));

		System.out.println("Count demo");
		long newFilteredCount = list.stream().filter(i -> i >= 20).count();
		System.out.println(newFilteredCount);
		
		//Count elements in stream
//		long newFilteredCount1 = list.stream().count();
//		System.out.println(newFilteredCount1);
		
		//Sorted Demo - sort a given stream
		System.out.println("Sorted demo");
		Stream <Integer> newFilteredList2 = list.stream().filter(i -> i >= 20).sorted();
		newFilteredList2.forEach(x -> System.out.println(x));
	
		//sort normal stream without filter
//		Stream <Integer> newFilteredList3 = list.stream().sorted();
//		newFilteredList3.forEach(x -> System.out.println(x));
		
		//Sorted in Descending order
		System.out.println("Sorted in descending order");
		Stream <Integer> newFilteredList4 = list.stream().sorted((i1,i2) -> i2.compareTo(i1)); //i1.compareTo(i2) will be ascending order
		newFilteredList4.forEach(x -> System.out.println(x));
		
		//Min
		System.out.println("Min value");
		Integer minInteger = list.stream().min((i1,i2) -> i1.compareTo(i2)).get(); 
		System.out.println(minInteger);
		//Max
		System.out.println("Max value");
		Integer maxInteger = list.stream().max((i1,i2) -> i1.compareTo(i2)).get(); //min/max can be reversed by changing i2.compareTo(i1)
		System.out.println(maxInteger);
		
		
		//toArray converts stream into arraytype
		Object[] intArr = list.stream().filter(i-> i>=20).toArray();
		for(Object o: intArr) {
			System.out.println("Element is : "+o);
		}
	}

}
