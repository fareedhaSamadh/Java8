package com.Biconsumer.example;

public class InterfaceDemoImpl1 implements FunctionalInterfaceDemo{

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo demo  = new InterfaceDemoImpl1() ;
		demo.myGetmethod1();
		
		InterfaceDemoImpl1 demo1  = new InterfaceDemoImpl1() ;
		demo1.myGetmethod1();

	}
	
	public  void myGetmethod1() {
		System.out.println("Hello i am specific impelementation!!!") ;
	}
	

	@Override
	public void myMethod() {
		
		
	}

}
