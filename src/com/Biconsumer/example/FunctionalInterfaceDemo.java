package com.Biconsumer.example;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void myMethod();
	
	public default void myGetmethod1() {
		System.out.println("Hello i am default FunctionalInterfaceDemo impelementation!!!") ;
	}
	
	default void myGetmethod2() {
		System.out.println("Welcome!!!") ;
	}
	
	
	/*
	 * default int hashCode() { return 5 ; }
	 */
}
