package week2;

import java.util.Scanner;

public class Program2 {

	static Scanner inputscanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Initialize variables.
		String firstname = "[Default]";
		String lastname = "[Default]";
		int age = 0;
		double avgsleep = 0.0;
		String info = "\nPersonal info - %1$s %2$s\n\n    First name: %1$s\n    Last name: %2$s\n    Age: %3$s years"
				+ "\n    Average sleep: %4$.0f hours";
		
		// Introduce program and get first name from user.
		System.out.print("Welcome! This program will display, in organized manner, basic personal info provided by you.\n\n"
				+ "Please enter your first name: ");
		firstname = inputscanner.nextLine();
		
		// Get last name from user.
		System.out.print("Please enter your last name: ");
		lastname = inputscanner.nextLine();
		
		// Get age from user.
		System.out.print("Please enter your age (as an integer): ");
		age = inputscanner.nextInt();
		inputscanner.nextLine();
		
		// Get average sleep data from user.
		System.out.print("Please enter your average sleep duration in hours (as a decimal): ");
		avgsleep = inputscanner.nextDouble();
		inputscanner.nextLine();
		
		// Print user's info.
		System.out.format(info, firstname, lastname, age, avgsleep);
		
	}

}
