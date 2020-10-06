import java.util.Scanner;

public class SphereVolume {
	public static void main (String[] args)
	{
		//Create a scanner object
		Scanner keyboard = new Scanner(System.in);
		//Print the purpose of the program 
		System.out.println("This is a program which calculates and displays"
				+ " a sphere's volume.");
		//Print a prompt asking for the diameter of a sphere 
		System.out.println("Please enter the diameter: ");
		//Read the diameter 
		double diameter = keyboard.nextDouble();
		if (diameter < 0)
		{
			System.out.println("No negative diameters. "
					+ "Please re-enter a positive diameter.");
			diameter = keyboard.nextDouble();
		}
		//Calculate the radius as diameter divided by 2 
		double radius = diameter/2;
		//Calculate volume of the sphere using the formula (V=4/3 πr^3)
		double volume = Math.PI * Math.pow(radius,3) * 4/3;
		//print the volume
		System.out.println("The volume of the sphere is " + volume);
		
	}
}
