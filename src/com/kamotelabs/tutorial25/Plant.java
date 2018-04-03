package com.kamotelabs.tutorial25;

public class Plant {
	// bad practice
	public String name;
	
	// acceptable practice
	public final static int ID = 8;
	
	public Plant() {
		name = "Freddy";
	}

}
