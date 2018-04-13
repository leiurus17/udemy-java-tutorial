package com.kamotelabs.tutorial44;

public class App {
	
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;
	
	public static void main(String[] args) {
		
		int animal = CAT;
		
		switch(animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		}
		
	}

}
