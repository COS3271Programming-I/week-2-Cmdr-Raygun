package week2;

import java.util.Scanner;

public class Program1 {

	static Scanner inputscanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Initialize variables.
		String firstname = "[Default]";
		String middlename = "[Default]";
		String lastname = "[Default]";
		String msg = "%1$s %2$s %3$s. What a nice name! You know, you work really hard all the time 😓. Why don't you take "
				+ "a little break?\nYou deserve it, %1$s. That embarassing accident earlier, well, that could have "
				+ "happened to anyone. Let it go 😮‍💨. \nWhy don't you kick back and relax a while? 😴";
		
		// Introduce program and get first name from user.
		System.out.print("You've had a long, hard day. How about a motivational message?\nNo? Well, too bad.\nTo write "
				+ "your motivational message, I'll need your first, middle and last names.\nEnter your first name: ");
		firstname = inputscanner.nextLine();
		
		// Get middle name from user.
		System.out.print("Good! Now, enter your middle name: ");
		middlename = inputscanner.nextLine();
		
		// Get last name from user.
		System.out.print("Excellent! Finally, enter your last name: ");
		lastname = inputscanner.nextLine();
		
		// Print motivational message.
		System.out.format(msg, firstname, middlename, lastname);
	}

}
