package com.kamotelabs.tutorial31;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a Machine.";
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera.";
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<>();

		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
		showList(list2);
	}

	// ? is a wildcard!
	public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
