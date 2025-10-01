package com.Biconsumer.example;

import java.util.function.BiConsumer;

public class LambdaDemo {

	public static void main(String[] args) {
	
		BiConsumer<Integer,Integer> biconsumer = (a,b) -> System.out.println(a+b) ;
		biconsumer.accept(10,15);

	}

}
