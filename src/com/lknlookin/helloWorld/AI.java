package com.lknlookin.helloWorld;

public class AI extends Employee implements IWebsiteCreator {

	public AI(String firstnameInput, String LastnameInput) {
		super(firstnameInput, LastnameInput, 0);
	}
	
	@Override
	public void createWebsite(String template, String titleName) {
		System.out.println("AI create web.");
	}
	
}
