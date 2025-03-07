package exam1Package;

import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double answer = 0;

		System.out.println("Input your first number: ");
		double input1 = input.nextDouble();

		System.out.println("Input your second number: ");
		double input2 = input.nextDouble();

		if (input2 == 0) {
			System.out.println("The system will not divide by zero. \nPlease try again.");
		} else {
			answer = input1 / input2;
			System.out.printf("The answer is %.2f when you divide %.2f by %.2f.", answer, input1, input2);
		}

	}// end main

}
