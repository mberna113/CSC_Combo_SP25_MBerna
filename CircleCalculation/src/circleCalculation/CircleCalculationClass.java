package circleCalculation;

import java.util.Scanner;

public class CircleCalculationClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		double r, d, a, c;
		
		System.out.println("Please input the radius of the circle: ");
		r = input.nextDouble();
		d = diam(r);
		a = area(r);
		c = circ(r);
		
		System.out.printf(
				"The radius entered was %.2f \n"
				+ "The diameter would be: %.2f \n"
				+ "The area would be: %.2f \n"
				+ "The circumference would be: %.2f",r, d, a, c);
	}

	private static double circ(double r) {
		return 2 * Math.PI * r;
	}

	private static double area(double r) {
		return Math.PI * r * r;
	}

	private static double diam(double r) {
		return r * 2;
	}

}
