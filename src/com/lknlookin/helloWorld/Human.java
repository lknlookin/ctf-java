package com.lknlookin.helloWorld;

public class Human extends Earthling{

	String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.eStatus = Status.BIRTH;
	}
	
	@Override
	public void move() {
		System.out.println("2 feet walk!");
	}

	@Override
	public void eat() {
		System.out.println("2 hand eat.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	

}
