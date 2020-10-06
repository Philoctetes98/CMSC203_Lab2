import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//Create a scanner object
		Scanner keyboard = new Scanner(System.in);
		//prompt the user to enter the first score
		System.out.println("Please enter the first score: ");
		//user inputs the first score
		int score1 = keyboard.nextInt();
		//prompt the user to enter the second score
		System.out.println("Please enter the second score: ");
		//user inputs the second score
		int score2 = keyboard.nextInt();
		//identifier declarations
		final int NUMBER = 2; // number of scores
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F - 32) * 5/9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//prompt user to input another temperature
		System.out.println("Please enter the temperature in Fahrenheit: ");
		//read the user’s temperature in Fahrenheit
		int temperature = keyboard.nextInt();
		//Task #2 convert the user’s temperature to Celsius
		double FtoC = (temperature - 32) * 5/9;
		//Task #2 print the user’s temperature in Celsius
		String secondOutput = temperature + " in Fahrenheit is " + FtoC + " in Celsius.";
		System.out.println(secondOutput);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

