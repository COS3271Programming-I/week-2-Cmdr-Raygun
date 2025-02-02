package week2;

public class Program3 {

	public static void main(String[] args) {
		// Initialize variables.
		int randomint = ((int) (Math.random()*255 + 1));
		String randombinary = Integer.toBinaryString(randomint);
		String randomhex = Integer.toHexString(randomint);
		
		// Introduce program.
		System.out.print("Welcome! This program will display a random integer in various forms.\n\n");
		
		// Print random number as integer.
		System.out.print("Integer: " + randomint);
		
		// Print random number in binary.
		System.out.print("\nBinary: " + randombinary);
		
		// Print random number in hexadecimal.
		System.out.print("\nHexadecimal: " + randomhex);
		
		// Print ASCII character corresponding to random number.
		System.out.print("\nASCII character: " + (char) randomint);
		
	}

}
