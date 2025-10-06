package com.Biconsumer.example;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		
		FunctionalInterfaceDemo demo = ()-> System.out.println("I am implementation of abstract method");
		demo.myMethod();
		
		//using method reference 
		FunctionalInterfaceDemo demo1 = MethodReferenceDemo :: methodReferenceMethod ;
		demo1.myMethod();

	}
	
	public static void methodReferenceMethod() {
		System.out.println("I am implementation using method reference") ;
	}

}
