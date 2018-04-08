package com.kamotelabs.tutorial35;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App3 {

	public static void main(String[] args) {

		Test test = new Test();
		
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}
		
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
