package com.Stream.Demo;

import java.util.stream.Stream;

public class OfStreamDemo {

	public static void main(String[] args) {
		
		Stream.of(1,100,67,93,15).forEach(num ->System.out.println(num));
		
		String[] values = {"code" , "Decode" , "Microservices" };
		
		Stream.of(values).filter( s-> s.length() >=5).forEach(System.out::println);

	}

}
