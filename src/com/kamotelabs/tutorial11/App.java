package com.kamotelabs.tutorial11;

public class App {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
