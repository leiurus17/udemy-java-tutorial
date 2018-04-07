package com.kamotelabs.tutorial30;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class App {

	public static void main(String[] args) {

		////// before java 5 //////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		// casting to String is needed because 
		// parameters once inside ArrayList are Objects 
		String fruit = (String) list.get(1);
		
		////// java 5 onwards /////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		///////// there can be more than one type argument /////////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		///////// Java 7 style //////////
		
		ArrayList<Animal> someList = new ArrayList<>();
		
		
		
		
	}

}
