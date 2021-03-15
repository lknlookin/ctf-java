package com.lknlookin.helloWorld;

public class Employee {

	public String firstname;
	public String lastname;
	public int salary;
	public String position;
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = positionInput;
	}
	
	public Employee() {
		this("noname", "homeless", 0, "ghost");
	}
	
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void checkPosition() {
		System.out.println("Position: " + this.position);
	}
	
	@Override
	public String toString() {
		return "Firstname: " + this.firstname + " Lastname: " + this.lastname;
	}
}
