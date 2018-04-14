package com.kamotelabs.tutorial48;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int id; // use transient keyword to prevent things from being serialized
	private String name;
	
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	public Person() {
		System.out.println("Default constructor.");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor.");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}

}
