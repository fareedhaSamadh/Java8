package com.BiPredicateBiFunction.Demo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bipredicateValue1 = (a,b) -> (a+b) >=5;
		System.out.println(bipredicateValue1.test(3, 2)) ;
		
		System.out.println(bipredicateValue1.test(3, 1)) ;
		
		//BiFunction
		BiFunction<Integer ,Integer,Integer> biFunctionValue = (a,b) -> (a+b) ;
		System.out.println(biFunctionValue.apply(10,20)) ;
		
		//BiConsumer
		BiConsumer<Integer,Integer> biconsumerValue = (a,b) -> System.out.println("Value of biconsumer is:::"+a*b) ;
		biconsumerValue.accept(5,2);
		
		

	}

}
