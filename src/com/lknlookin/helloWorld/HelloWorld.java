package com.lknlookin.helloWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		lab6_1();
		lab6_2();
		lab6_3();
		lab6_4();
		
		lab7_1();
		lab7_2();
		
		lab8();
	}
	
	public static void lab6_1() {
		int i = 0;
		while( i <= 10 ) {
			System.out.println(i++);
		}
	}
	
	public static void lab6_2() {
		int count = 1;
		int sum = 0;
		while( count <= 10 ) {
			sum += count++;
		}
		System.out.println(sum);
	}
	
	public static void lab6_3() {
		int i = 1;
		ArrayList<Integer> out = new ArrayList<Integer>();
		
		while(i <= 100) {
			if(i%12 == 0) {
				out.add(i);
			}
			i++;
		}
		System.out.println(out);
	}
	
	public static void lab6_4() {
		int[] a = {1,2,3,4,5};
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void lab7_1() {
		int i = 20;
		
		do {
			System.out.println(i--);
		} while(i>0);
	}
	
	public static void lab7_2() {
		Scanner sc = new Scanner(System.in);
		int i;
		
		do {
			System.out.print("Please input the number >> ");
			i = sc.nextInt();
		}while(i%2 != 1);
		
		sc.close();
	}
	
	public static void lab8() {

		for(int count = 20; count > 0; count--) {
			if(count == 11) {
				System.out.println(count);
				break;
			}
			System.out.println("in for loop");
		}
	}
}
