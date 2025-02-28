package Loops;

import java.util.Scanner;

public class WhileFibonacci {

	public static void main(String[] args) {
		
		//Start Scanner and print starting message
 		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer (above 3) to find the Fibonacci sequence up to that number (10 is the assignment):");

		
		// Check to see if it is an integer;
		if (input.hasNextInt()) {
			int numInput = input.nextInt();
			int numInput2 = numInput - 3;
			
			
			//Check to see if it is a positive number;
			if (numInput2 > 0) {
				
				//initialize total outside of for loop 
				int total = 0;
				int first = 0;
				int second = 1;
				int i = 0;
				
				System.out.println("0");
				System.out.println("1");
				//---------------------------------------------------------------------------
				while (i <= numInput2) {
					total = first + second;
					System.out.println(total);
					first = second;
					second = total;
					
					//Changer
					i++;
									
				};
				
				//-----------------------------------------------------------------------------
				
				
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