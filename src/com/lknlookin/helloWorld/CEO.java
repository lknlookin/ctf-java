package com.lknlookin.helloWorld;

public class CEO extends Employee{

	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput, "CEO");
	}
	
	@Override
	public int getSalary() {
		return super.getSalary()*2;
	}
	
	@Override
	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}
	
	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
	
	public void seminar() {
		System.out.println("Seminar");
	}
	
	public void hire() {
		System.out.println("Hire!");
	}
	
	public void work() {
		seminar();
		hire();
		fire(new Employee("Noob","Man",6000,"Dev"));
	}
	
	public void orderWebsite(IWebsiteCreator webCreator){
		System.out.println("IWebsiteCreator create website.");
	}
}
