package com.Predicate.Demo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<String> myPredicate = s -> s.length()>=5;
		System.out.println("String value is :::"+myPredicate.test("Fareedha")) ;
		
		//without Predicate
		PredicateDemo obj = new PredicateDemo() ;
		System.out.println("without Predicate:::::::"+obj.myValue("Fareedha") ) ;
 
	}
	
	public boolean myValue(String s) {
		if(s.length()>=5) {
			return true;
		}
		else {
			return false;
		}
	}

}
