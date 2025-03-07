package exam1Package;

import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(
				"What would you like? \nPlease enter the number for your option.\n"
				+ "Water(1), Coke(2), or Coffee(3)\n");
		int userNum = input.nextInt();

		if (userNum == 1) {
			System.out.println("You picked Water!");
		}
		if (userNum == 2) {
			System.out.println("You picked Coke!");
		}
		if (userNum == 3) {
			System.out.println("You picked Coffee!");
		}

		System.out.println("Enjoy!");

	}// end of main

}
