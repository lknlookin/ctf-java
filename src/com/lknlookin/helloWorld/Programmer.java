package com.lknlookin.helloWorld;

public class Programmer extends Employee {

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput, "Programmer");
	}

	public void createWebsite(String template, String titleName) {
		System.out.println("Create website");
	}
	
	public void installWindows(String version, String productKey) {
		System.out.println("Install Windows");
	}
	
}
