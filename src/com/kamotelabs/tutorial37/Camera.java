package com.kamotelabs.tutorial37;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Starting camera.");
	}

	@Override
	public void doStuff() {
		System.out.println("Doing camera stuffs.");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down camera.");
	}

}
