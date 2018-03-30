package com.kamotelabs.tutorial24;

public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		mach1.showInfo();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		
		info1.showInfo();
		// info1.start();
		
		Info info2 = person1;
		info2.showInfo();
	}
}
