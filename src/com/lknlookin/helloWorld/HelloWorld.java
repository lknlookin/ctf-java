package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		int i = 20;
		
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		
		float f1 = 1.2f;
		float f2 = 3.4f;
		System.out.println((f1 == 1.2f) && (f2 != 2.3f));
		
		char a = 'a';
		char b = 'b';
		System.out.println((a == 'c') || (b == 'b'));
	}
}
