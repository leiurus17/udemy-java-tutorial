package com.kamotelabs.tutorial44;

public class App {
	
	public static void main(String[] args) {
		
		Animal animal = Animal.CAT;
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
		
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.DOG instanceof Object);
		
		System.out.println(Animal.MOUSE.getName());
		System.out.println(Animal.CAT.toString());
		
		System.out.println("Enum name as a string: " + Animal.DOG.name());
	}

}
