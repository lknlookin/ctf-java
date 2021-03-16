package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		
		Human a = new Human("A", 10);
		a.move();
		a.eat();
		a.stand();
		System.out.println(a.getStatus());
		System.out.println(a.getAge());
		a.die();
		System.out.println(a.getStatus());
	}
	
}