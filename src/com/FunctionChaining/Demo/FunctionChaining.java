package com.FunctionChaining.Demo;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer,Integer> doubleNum = num -> num * 2;
		System.out.println("Double of number is:::"+doubleNum.apply(2)) ;
		
		Function<Integer,Integer> cubeIt = num -> num * num * num;
		System.out.println("Double of number is:::"+cubeIt.apply(2)) ;
		
		System.out.println("Using andThen method:::"+ doubleNum.andThen(cubeIt).apply(2));
		
		System.out.println("Using compose method:::"+ doubleNum.compose(cubeIt).apply(2));
		
		
		
		

	}

}
