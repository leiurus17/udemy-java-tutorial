package com.kamotelabs.tutorial36;

public class App {

	public static void main(String[] args) {

		// java.lang.ArrayIndexOutOfBoundsException
		try {
			String[] texts = { "one", "two", "three" };
			System.out.println(texts[3]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// java.lang.NullPointerException
		try {
			String text = null;
			System.out.println(text.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// java.lang.ArithmeticException
		try {
			int value = 7;
			value = value / 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
