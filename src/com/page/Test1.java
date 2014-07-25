package com.page;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class Test1 {

	public static void main(String[] args) {
		Console cnsl = null;
		String alpha = null;
		try{
			// creates a console object
			cnsl = System.console();
			// if console is not null
			if (cnsl != null) {
				// read line from the user input
				alpha = cnsl.readLine("Name: ");
				// prints
				System.out.println("Name is: " + alpha);
				// read password into the char array
				char[] pwd = cnsl.readPassword("Password: ");
				// prints
				System.out.println("Password is: "+pwd);
			}      
		}catch(Exception ex){
			// if any error occurs
			ex.printStackTrace();      
		}
	}
}
