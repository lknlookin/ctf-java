package com.lknlookin.helloWorld;

public class Employee {

	public String firstname;
	public String lastname;
	public int salary;
	public String position;
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}
	
	public void hello() {
		System.out.println("Hello " + firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void checkPosition() {
		System.out.println("Position :" + position);
	}
	
}
