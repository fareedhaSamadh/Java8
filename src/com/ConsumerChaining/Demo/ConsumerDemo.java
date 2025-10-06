package com.ConsumerChaining.Demo;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> number1 = num -> System.out.println("Value of number after squared is:::"+num*2) ;
		number1.accept(2);
		
		Consumer<Integer> number2 = num -> System.out.println("Value of number after squared is:::"+num*num*num) ;
		number2.accept(2);
		
		System.out.println("Consumer Chaining............");
		number1.andThen(number2).accept(5); // here the first output will not be cubed as it will not return anything

	}

}
