package com.kamotelabs.tutorial45;

public class App {
	
	public static void main(String[] args) {
		
		calculate(4);
		
	}
	
	private static void calculate(int value) {
		System.out.println(value);
		
		calculate(value);
		
	}

}
