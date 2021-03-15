package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";
		
		//1
		System.out.println(String1.equals(String2));
		
		//2
		String you = "you";
		System.out.println(String1.contains(you)? you : "Not found "+ you +" in "+String1);
		System.out.println(String2.contains(you)? you : "Not found "+ you +" in "+String2);
		
		//3
		System.out.println(String1.length());
		System.out.println(String2.length());
		
		//4
		System.out.println(String1.substring(1,4));
		System.out.println(String2.substring(1,4));
		
		//5
		System.out.println(String1.trim());
		System.out.println(String2.trim());
		
		//6
		System.out.println(String1.toUpperCase());
		System.out.println(String2.toUpperCase());
		
		//7
		System.out.println(String2.toUpperCase().trim());
		
	}
	
}
