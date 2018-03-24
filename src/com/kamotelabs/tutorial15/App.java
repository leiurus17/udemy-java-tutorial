package com.kamotelabs.tutorial15;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	void calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		System.out.println(yearsLeft);
	}
}

public class App {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age = 25;
		
		person1.speak();
		person1.calculateYearsToRetirement();
	}

}
