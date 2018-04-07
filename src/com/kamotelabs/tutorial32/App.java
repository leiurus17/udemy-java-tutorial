package com.kamotelabs.tutorial32;

class Machine {
	public void start() {
		System.out.println("Starting machine ...");
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine() {

			@Override
			public void start() {
				System.out.println("Camera snapping ...");
			}
			
			
		};
		
		machine1.start();
		
		
	}

}
