package com.lknlookin.helloWorld;

public class Day10 {

	public static void main(String[] args) {
		
		CEO ceo = new CEO("Bob", "Blah", 1000000);
		Employee emp = new Employee("John", "Doe", 10000, "Staff");
		
		System.out.println(ceo);
		System.out.println(emp);
		
		Programmer prg = new Programmer("Pitch", "Dev", 50000);
		Employee ght = new Employee();
		
		System.out.println(prg.getSalary());
		
		System.out.println(ght);
		ght.checkPosition();
	}
	
}
