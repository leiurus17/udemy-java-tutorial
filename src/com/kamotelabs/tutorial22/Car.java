package com.kamotelabs.tutorial22;

public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car started.");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield.");
	}
	
	public void showInfo() {
		System.out.println(name);
	}
}
