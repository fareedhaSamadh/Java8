package com.TerminalNonTerminalOperatioms.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalVsNonTerminal {

	public static void main(String[] args) {
	
		List<Integer> intList = Arrays.asList(1,2,3,4,5) ;
		
		intList.stream().filter(num ->num%2==0).peek(num -> System.out.println("Even numbers are:::"+(num+2))).count() ;
		
		//reduce operation 
		  int value = intList.stream().reduce((a,b) -> a+b).get() ;
		  System.out.println("Final result is :::"+value);
		  
		//  intList.stream().limit(-2).forEach(System.out::println);
		  
		int findFirst = intList.parallelStream().findAny().get() ;
		System.out.println("Find first:::"+findFirst);
		
		boolean anyMatch = intList.stream().anyMatch( num ->num>=1) ;
		System.out.println("anyMatch:::"+anyMatch);
		
		boolean anyMatch1 = intList.stream().anyMatch( num ->num>=11) ;
		System.out.println("anyMatch1:::"+anyMatch1);
		
		boolean allMatch = intList.stream().allMatch( num ->num>=1) ;
		System.out.println("allMatch:::"+allMatch);
		
		
		boolean allMatch1 = intList.stream().allMatch( num ->num>=100) ;
		System.out.println("allMatch1:::"+allMatch1);
		
		boolean noneMatch = intList.stream().noneMatch( num ->num>=1) ;
		System.out.println("noneMatch:::"+noneMatch);
		
		boolean noneMatch1 = intList.stream().noneMatch( num ->num>=100) ;
		System.out.println("noneMatch1:::"+noneMatch1);
		
		
		
		
	
		
		

	}

}
