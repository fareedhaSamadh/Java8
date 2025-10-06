package com.Biconsumer.example;

public class DiamondProblemImplementation implements FunctionalInterfaceDemo,DiamondProblemInterface{

	public static void main(String[] args) {
		DiamondProblemImplementation demo = new DiamondProblemImplementation();
		demo.myGetmethod1();
	}

	@Override
	public void myGetmethod1() {		
		DiamondProblemInterface.super.myGetmethod1();
	}
	
	

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}



}
