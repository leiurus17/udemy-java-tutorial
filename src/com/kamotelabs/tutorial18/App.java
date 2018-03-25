package com.kamotelabs.tutorial18;

class Machine {
	private String name;
	private int code;
	
	public Machine () {
		
		System.out.println("Constructor running!");
		
		name = "Arnie";
	}
	
	public Machine(String name) {
		
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		new Machine(); // This invoke an instance of object in itself
		
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Chalky", 7);
	}

}
