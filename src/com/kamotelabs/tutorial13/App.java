package com.kamotelabs.tutorial13;

class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	String heroType;
}

public class App {
	
	public static void main(String[] args) {
		
		Person person1   = new Person();
		person1.name     = "Miya";
		person1.age      = 28;
		person1.heroType = "Marksman";
		
		Person person2   = new Person();
		person2.name     = "Layla";
		person2.age      = 23;
		person2.heroType = "Marksman";
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.heroType);
		
		System.out.println();
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.heroType);
	}

}
