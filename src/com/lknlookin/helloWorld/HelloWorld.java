package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		bark();
		
		float f = 1.23f;
		int i = 10;
		double d = 6.6;
		char c = 'c';
		
		System.out.println((int) f);
		System.out.println((float) i);
		System.out.println((float) d);
		System.out.println((int) c);
		
		final String hello = "Hello";
		hello = "World";
	}
	
	public static void bark() {
		String dogName = "Dugdig";
		System.out.println("The Dog name = " + dogName + " bark");
	}
}
