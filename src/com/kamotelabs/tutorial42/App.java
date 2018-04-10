package com.kamotelabs.tutorial42;

class Person {
	private int id;
	private String name;
	
    public Person(int id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name;
	}
    
    
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(8, "Sue");
		
		System.out.println(person1 == person2);

	}

}
