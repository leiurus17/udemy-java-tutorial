package com.kamotelabs.tutorial16;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
}

public class App {
	
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("Hi I'm Sam!");
		
	}

}
