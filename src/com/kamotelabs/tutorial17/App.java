package com.kamotelabs.tutorial17;

class Frog {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.name = "Bertie";
		frog1.age = 1;
		
		System.out.println(frog1.getName());
	}

}
