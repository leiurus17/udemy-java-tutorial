package com.kamotelabs.tutorial25_2;

import com.kamotelabs.tutorial25.Plant;

public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// won't work --- type is private
		// System.out.println(plant.type);
		
	}

}
