package exam1Package;

import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double sum = 0;

		System.out.println(
				"This system is designed to sum all of the numbers "
				+ "that are inputed until the user inputs a 0\n");
		System.out.println("Please enter your first number: ");
		double num = input.nextDouble();

		while (num != 0) {
			sum += num;
			System.out.println("What is your next number (or enter 0 to finish)");
			num = input.nextDouble();
		}

		System.out.printf("The sum of all of the inputs is: %.2f.", sum);

	}// end main 

}
