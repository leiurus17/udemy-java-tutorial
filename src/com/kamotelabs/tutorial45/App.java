package com.kamotelabs.tutorial45;

public class App {
	
	public static void main(String[] args) {
		
		int value = 4;
		
		calculate(value);
		
		System.out.println(value);
	}
	
	private static void calculate(int value) {
		
		value = value - 1;
		System.out.println(value);
	}

}
