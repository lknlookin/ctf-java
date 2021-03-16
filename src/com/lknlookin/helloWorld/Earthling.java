package com.lknlookin.helloWorld;

public abstract class Earthling {
	
	public static int lifespan;
	public final String planet = "Earth";
	public Status eStatus;
	
	enum Status{
		BIRTH,
		LIFE,
		DISEASED,
		DEAD
	}
	
	public abstract void move();
	public abstract void eat();
	
	public void stand() {
		System.out.println("Stand still...");
	}
	
	public final Status getStatus() {
		return this.eStatus;
	}
	
	public void die() {
		this.eStatus = Status.DEAD;
		System.out.println(Final.value);
	}
}
