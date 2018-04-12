package com.kamotelabs.tutorial43;

public class Robot {

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}
	
	public class Legs {
		public void run() {
			System.out.println("Robot " + id + " is running.");
		}
	}

	private int id;

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);

		Brain brain = new Brain();

		brain.think();
		
		final String name = "Robert";
		
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();

	}
	
	
}
