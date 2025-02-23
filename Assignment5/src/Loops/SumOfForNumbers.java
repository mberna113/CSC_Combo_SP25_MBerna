package Loops;

import java.util.Scanner;

public class SumOfForNumbers {

	public static void main(String[] args) {
		
		//start a scanner just to change it up and get more practice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer to find the sum of the first N natural numbers (10 is the assignment):");

		
		// Check to see if it is an integer;
		if (input.hasNextInt()) {
			int numInput = input.nextInt();
			
			//Check to see if it is a positive number;
			if (numInput >0) {
				
				//initialize total outside of for loop; 
				int total = 0;
				
				//run for loop starting with numInput and running through numInput times
				for (int i = 1; i <= numInput; i++) 
				{
					total += i; // same as total = total + i
//					System.out.println(i);
				};
				
				//print out the final result;
				System.out.println(total);
				
			}
			//error message for negative numbers
			else {
				System.out.println("Invalid input. Please enter a positive number only (no zeros or negatives). ");
			}
		}
		//error message for non integer numbers
		else {
			System.out.println("Invalid input. Please enter a whole number only (no decimals or letters).");
		}
		
		

	}

}
