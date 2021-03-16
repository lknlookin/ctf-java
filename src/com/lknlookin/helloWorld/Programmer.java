package com.lknlookin.helloWorld;

public class Programmer extends Employee implements IWebsiteCreator {

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput, "Programmer");
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.println("Create website");
	}
	
	public void installWindows(String version, String productKey) {
		System.out.println("Install Windows");
	}
	
	public void fixPC() {
		System.out.println("Fix PC");
	}
	
	public void work() {
		createWebsite("A", "Part4 site");
		fixPC();
		installWindows("Windows10", "xxxx-xxxx-xxxx-xxxx");
	}
	
}
