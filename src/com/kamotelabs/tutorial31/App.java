package com.kamotelabs.tutorial31;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "Machine [toString()=" + super.toString() + "]";
	}
	
}

class Camera extends Machine {
	
}

public class App {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		
		showList(list);
	}
	
	public static void showList(ArrayList<String> list) {
		for(String value: list) {
			System.out.println(value);
		}
	}

}
