package exam1Package;

import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number: ");
		int num1 = input.nextInt();

		System.out.println("Enter your second number: ");
		int num2 = input.nextInt();

		boolean test = false;

		test = makes10(num1, num2);

		if (test) {
			System.out.printf("The numbers %d and %d sum up to 10!", num1, num2);
		} else {
			System.out.printf("The numbers %d and %d DO NOT sum up to 10", num1, num2);
		}
	}// end of main

	private static boolean makes10(int num1, int num2) {
		int sum = num1 + num2;
		if (sum == 10) {
			return true;
		}
		return false;
	}//end makes10

}
