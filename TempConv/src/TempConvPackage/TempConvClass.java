package TempConvPackage;

import java.util.Scanner;

public class TempConvClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Conversion System");
		System.out.println("To get started please enter a temperature in degrees Fahrenheit");
		
		double degreeF = input.nextDouble();
		
		double calcC = ((degreeF-32)*(5.0/9.0)); // The X.0 confirms that java treats it like it is a floating point division
		
		double calcK = calcC + 273.15;
		
		System.out.printf("%n%s degrees Fahrenheit would be:%n%n", degreeF);
		System.out.printf("Temperature in Celsius: %.2f%n%n", calcC); // the %.2f is the piece that formats it to 2 decimal places
		System.out.printf("or%n");
		System.out.printf("%nTemperature in Kelvin: %.2f%n", calcK);
		

		input.close();

	}

}
