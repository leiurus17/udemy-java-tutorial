package com.kamotelabs.tutorial14;

class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	String heroType;
	
	void speak() {
		System.out.println("Hello, my name is: " + name + " and I am " + age + ". I am a " + heroType + ".");
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
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
		
		person1.speak();
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.heroType);
		person1.sayHello();
		
		System.out.println();
		
		person2.speak();
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.heroType);
		person2.sayHello();
	}

}
