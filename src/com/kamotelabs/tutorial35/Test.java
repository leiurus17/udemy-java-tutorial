package com.kamotelabs.tutorial35;

import java.io.IOException;
import java.text.ParseException;


public class Test {

	public void run() throws IOException, ParseException {
		// throw new IOException();
		throw new ParseException("Error in command list", 2);
	}
}
