package triangleAssignment;

import java.util.Scanner;

public class TriangleClass {

	public static void main(String[] args) {
		
		//Start scanner
		Scanner input = new Scanner(System.in);
		
		//initiate num variable to keep it outside of the while loop as well. 
		int num = 0;
		char con = 'Y';
		
		
		while (con == 'Y' || con == 'y') {
		
//----------------------------------------------------------------------------------------
			// While loop to ensure that the input number is an int and between 1 and 50
			//if it is true then break loop and continue onto the character 
			while (true) {
				System.out.println("Please give a number for the base of the triangle (5): ");
						
				if (input.hasNextInt()){   //Ensure that it is an int
					num = input.nextInt();
					
					if (num >= 1 && num <= 50){   //Ensure that it is between 1 and 50
						break;   // if it is correct BREAK to further code
					} 
					else {
						System.out.println("Please try again with a number between 1 and 50: ");
						
					}
				}
				else 
				{
					System.out.println("Please try agian with a positive whole number: ");
					input.next();// consume the invalid token to open that slot back up
				}
			}
			
	//----------------------------------------------------------------------------------------
			//after a valid number is found, get a fill character
			System.out.println("Please give the character that you would like to make the triangle out of (*): ");
			char fillChar = input.next( ).charAt(0);
			
			//test for num and fillChar
			System.out.printf("Number was: \"%d\" and character is \"%s\"\n\n", num, fillChar);
	
	//----------------------------------------------------------------------------------------
			//run the logic for the triangle and print it 
			
			for (int row = 1; row <= num; row++) {
				
				//printing left spaces
				for(int lSpace = 1; lSpace <= num - row; lSpace ++) {
					System.out.print(" ");
				}
				//printing fillChar and a space 
				for (int i = 1; i<= row; i++) {
					System.out.printf("%s ",fillChar);
				}
				//printing right spaces
				for (int rSpace = 1; rSpace <= num - row; rSpace ++) {
					System.out.print(" ");
				}
				//start newline 
				System.out.print("\n");
//----------------------------------------------------------------------------------------
			}
		
		System.out.println("Would you like another triangle? (Y/N)");
		con = input.next().charAt(0);
		
		}
		//this line is only reached after there is not a Y or y input into the while loop
		System.out.println("\n\nThanks for testing this program! \nSee you next time!");

	}
}
