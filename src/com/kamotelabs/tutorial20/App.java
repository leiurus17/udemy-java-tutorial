package com.kamotelabs.tutorial20;

public class App {
	
	public static void main(String[] args) {
		
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		System.out.printf("Total cost %d: Quantity is %d.\n", 5, 120);
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		System.out.printf("Total value: %.2f\n", 5.63434);
		System.out.printf("Total value: %5.1f\n", 5.63434);
	}

}
