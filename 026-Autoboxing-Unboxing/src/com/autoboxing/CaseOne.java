package com.autoboxing;

public class CaseOne {
	
	public static void myMethod(Integer num) {
		// computer automatically converts it into the integer wrapper 
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		myMethod(5);

	}

}
