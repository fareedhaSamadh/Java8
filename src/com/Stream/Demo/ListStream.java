package com.Stream.Demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,2,3,4,5) ;
		list.stream().filter(num -> num >=3).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Even or Odd") ;
		list.stream().filter(num -> num%2==0).forEach(System.out::println);
		
		System.out.println("MAP DEMO.............") ;
		list.stream().map(num ->num*2).forEach(System.out::println);
		
		//Count 
		long count = list.stream().filter(num -> num>=2).count() ;
		System.out.println("Count value is:::"+count);
		
		System.out.println("Sorted DEMO.............") ;
		List<Integer> listSort =Arrays.asList(11,2,43,49,9,15) ;
		listSort.stream().filter(num -> num>=11).sorted().forEach(System.out::println);
		
		System.out.println("Sorted DEMO without filter NATURAL ORDER.............") ;
		listSort.stream().sorted().forEach(System.out::println);
		
		System.out.println("Sorted DEMO without filter DESCENDING ORDER.............") ;
		listSort.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("Sorted DEMO without filter NATURAL ORDER uisng comparator methods.............") ;
		listSort.stream().sorted((num1,num2) -> num1.compareTo(num2)).forEach(System.out::println);
		
		System.out.println("Sorted DEMO without filter DESCENDING ORDER uisng comparator methods.............") ;
		listSort.stream().sorted((num1,num2) -> num2.compareTo(num1)).forEach(System.out::println);
		
		int minValue = listSort.stream().min((num1,num2) -> num1.compareTo(num2)).get();
		System.out.println("Minimum value ::: " +minValue);
		
		int maxValue = listSort.stream().max((num1,num2) -> num1.compareTo(num2)).get();
		System.out.println("MAximum value ::: " +maxValue);
		
		System.out.println("TO ARRAY METHOD ..............");
		Object[] newArray = listSort.stream().toArray() ;
		for(Object obj : newArray) {
			System.out.println(obj) ;
		}

	}

}
