package com.Predicate.Demo;

import java.util.function.Predicate;

public class PredicateChainingDemo {

	public static void main(String[] args) {
		
		Predicate<String> lengthCheck = s -> s.length() >=5;
		System.out.println("Result of lengthCheck:::"+lengthCheck.test("Fareedha")) ;
		
		Predicate<String> evenOrOddCheck = s -> s.length() %2 ==0;
		System.out.println("Result of predicateAnd:::"+evenOrOddCheck.test("Fareedha")) ;
		
		//PredicateAndTesting
		System.out.println("PredicateAndTesting:::"+lengthCheck.and(evenOrOddCheck).test("Fareedha"));
		
		//PredicateORTesting
		System.out.println("PredicateAndTesting:::"+lengthCheck.or(evenOrOddCheck).test("Fareedha"));
				
		//PredicateNegateTesting
		System.out.println("PredicateAndTesting:::"+lengthCheck.negate().test("Fareedha"));

	}

}
