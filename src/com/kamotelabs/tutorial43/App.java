package com.kamotelabs.tutorial43;

public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		
		robot.start();
		
		Robot.Legs legs = robot.new Legs();
		
		legs.run();
		
		Robot.Battery battery = new Robot.Battery();
		
		battery.charge();
	}

}
