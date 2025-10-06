package com.Biconsumer;

import com.Biconsumer.example.InterfacewithStaticMethod;

public class StaticMethodImpl implements InterfacewithStaticMethod {

	public static void main(String[] args) {
		//calling static method from impl class 
		//InterfaceName.staticMethod
		InterfacewithStaticMethod.myUtilityClass();
		
		StaticMethodImpl obj = new StaticMethodImpl()  ;
		obj.getMethod(); //calling default method as it is available by default
	//	obj.myUtilityClass() ;  //static methods cannot be accessed by default since static methods belong to interface only
		//we can access the static methods by using InterfaceName
		//InterfacewithStaticMethod.myUtilityClass();

	}
	
	@Override
	public void getMethod() {
		System.out.println("I am inside implementation") ;
	}

}
