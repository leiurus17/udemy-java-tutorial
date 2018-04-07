package com.kamotelabs.tutorial26;

public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = plant1;
		Plant plant3 = tree;
		
		plant2.grow();
		plant3.grow();
		
		tree.shedLeaves();
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
		
	}

}
