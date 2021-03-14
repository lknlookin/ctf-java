package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		int a = returnVal();
		System.out.println(a);
		
		notReturnVal();
	}
	
	public static int returnVal() {
		System.out.println("This method is return val! see below");
		return 29;
	}
	
	public static void notReturnVal() {
		System.out.println("This method is not return val!");
	}
}
