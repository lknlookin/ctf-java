package com.lknlookin.helloWorld;

public class OfficeCleaner {
	
	public void clean() {
		System.out.println("clean");
	}
	
	public void killCockroach() {
		System.out.println("killCockroach");
	}
	
	public void decorateRoom() {
		System.out.println("decorateRoom");
	}
	
	public void welcomeGuest() {
		System.out.println("welcomeGuest");
	}
	
	public void work() {
		clean();
		killCockroach();
		decorateRoom();
		welcomeGuest();
	}
}
