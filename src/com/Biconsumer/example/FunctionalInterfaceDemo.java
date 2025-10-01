package com.Biconsumer.example;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void myMethod();
	
	default void myGetmethod1() {
		System.out.println("Hello!!!") ;
	}
	
	default void myGetmethod2() {
		System.out.println("Welcome!!!") ;
	}
	
	
}
