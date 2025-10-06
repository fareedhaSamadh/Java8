package com.SupplierDemo.example;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Date> getMyDate = () -> new Date() ;
		System.out.println(getMyDate.get()) ;

	}

}
