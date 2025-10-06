package com.Biconsumer.example;

public interface InterfacewithStaticMethod {
	
	default void getMethod() {
		System.out.println("I am inside interface") ;
	}
	public static void myUtilityClass()
	{
		System.out.println("This is my interface with Static utility method") ;
		
	}

}
