package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		int score = 66;
		boolean isHandSome = true;
		
		if(score >= 80 || isHandSome) {
			System.out.println("Good");
		}else if(score >= 50) {
			System.out.println("normal");
		}else {
			System.out.println("fail");
		}
	}
}
