package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee("firstname"+i, "lastname"+i, i*10000, "Staff");
		}
		
	}
	
}