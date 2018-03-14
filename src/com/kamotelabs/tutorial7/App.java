package com.kamotelabs.tutorial7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a line: ");
		
		// Wait for the user to enter something.
		String stringLine = input.nextLine();
		
		// Tell them what they entered.
		System.out.println("You entered: " + stringLine);
		
		// Output the prompt
		System.out.println("Enter a number: ");
		
		// Wait for the user to enter something.
		int number = input.nextInt();
		
		// Tell them what they entered.
		System.out.println("You entered: " + number);
		
		// Output the prompt
		System.out.println("Enter a floating point value: ");
				
		// Wait for the user to enter something.
		double floating = input.nextDouble();
				
		// Tell them what they entered.
		System.out.println("You entered: " + floating);
		
		input.close();
	}
}
