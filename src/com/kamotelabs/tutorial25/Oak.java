package com.kamotelabs.tutorial25;

public class Oak extends Plant {
	
	public Oak() {
		// won't work --- type is private
		// type  = "tree";
		
		// this works -- size is protected, Oak is a subclass.
		this.size = "large";
		
		this.height = 10;
	}

}
