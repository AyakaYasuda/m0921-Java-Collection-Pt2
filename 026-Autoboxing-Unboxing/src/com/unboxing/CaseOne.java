package com.unboxing;

public class CaseOne {
	
	public static void myMethod(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
			
		Integer intObject = new Integer(100);
		myMethod(intObject);
			

	}

}
