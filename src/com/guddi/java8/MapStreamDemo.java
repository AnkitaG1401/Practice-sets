package com.guddi.java8;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;

public class MapStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(45);
		list.add(15);
		list.add(6);
		
//		Stream s = list.stream().map(i -> i*i);
//		s.forEach(x ->System.out.println(x));
		
		//list.stream() - Creation
		//list.stream().map(i -> i*i) - Configuration - 2types - filter, map
		//forEach(x ->System.out.println(x) - Processing - 7types
		list.stream().map(i -> i*i).forEach(x ->System.out.println(x));

		
		
	}

}
