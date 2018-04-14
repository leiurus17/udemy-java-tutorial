package com.kamotelabs.tutorial47;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(77, "Bob")};
		
		try (FileOutputStream fs = new FileOutputStream("array.ser")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
