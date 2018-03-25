package com.kamotelabs.tutorial19;

class Thing {
	public String name;
	public static String description;
	
	// Instance method
	public void showName() {
		System.out.println(name);
		System.out.println(description); // Instance method can output static variables
	}
	
	// Class method
	public static void showInfo() {
		System.out.println(description);
		// System.out.println(name); // Static method can't output instance variables!
	}
}

public class App {
	
	public static void main(String[] args) {
	
		Thing.description = "I am a thing";
		
		System.out.println(Thing.description);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		System.out.println(thing1.description); // A warning
		
		thing1.showName();
		thing2.showName();
		
		Thing.showInfo();
	}

}
