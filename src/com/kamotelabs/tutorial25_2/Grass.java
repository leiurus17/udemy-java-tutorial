package com.kamotelabs.tutorial25_2;

import com.kamotelabs.tutorial25.Plant;

public class Grass extends Plant {
	
	public Grass() {
		
		// won't work, Plant is not in the same package
		// System.out.println(this.height);
	}

}
