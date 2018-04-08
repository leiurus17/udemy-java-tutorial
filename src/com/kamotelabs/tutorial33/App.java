package com.kamotelabs.tutorial33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "example.txt"; // path to the example.txt
		
		// if you don't want to expose paths, just put the file
		// on the root folder of your project. it is the default working directory
	
		File textFile = new File(filename);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		
		int count = 2;
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ":" + line);
			
			count++;
		}
		
		in.close();
	}

}
