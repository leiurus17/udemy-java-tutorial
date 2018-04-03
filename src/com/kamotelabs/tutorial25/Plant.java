package com.kamotelabs.tutorial25;

public class Plant {
	// bad practice
	public String name;
	
	// acceptable practice
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		name = "Freddy";
		type = "plant";
		size = "medium";
		height = 8;
	}

}
