package com.kamotelabs.tutorial43;

public class Robot {

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
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
	}

}
