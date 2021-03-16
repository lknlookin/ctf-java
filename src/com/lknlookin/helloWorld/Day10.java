package com.lknlookin.helloWorld;

import java.util.ArrayList;

public class Day10 {

	public static void main(String[] args) {
		
		Employee dang = new Employee("Dang", "Red", 10000);
		Employee ceo = new CEO("Captain", "Marvel", 30000);
		Programmer prog = new Programmer("Captian", "Marvel", 20000);
		CEO ceo2 = (CEO) ceo;
		
		ArrayList<Employee> myList = new ArrayList<Employee>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		ceo3.hello();
		prog2.hello();
		
		
		
		CEO ceo4 = new CEO("Captain", "Marvel", 30000);
		IWebsiteCreator dang3 = new Programmer("Dang", "Red", 10000);
		Programmer dang4 = (Programmer) dang3;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		
		ceo4.orderWebsite(dang3);
		ceo4.orderWebsite(dang4);
		ceo4.orderWebsite(alphaGo);
		ceo4.orderWebsite(alphaGo2);
		
	}
	
}
