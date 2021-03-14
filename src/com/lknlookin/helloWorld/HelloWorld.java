package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		lab9();
		lab10();
	}
	
	public static void lab9() {
		for(int count = 20; count > 0; count--) {
			if(count == 11) {
				System.out.println(count);
				continue;
			}
			System.out.println(count + " is not 11!");
		}
	}
	
	public static void lab10() {
		for(int i=1;i<=10;i++) {
			if(i==2) continue;
			
			System.out.println(i);
		}
	}
}
