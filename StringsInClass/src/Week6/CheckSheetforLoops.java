package Week6;

import java.util.Random;
import java.util.Scanner;

public class CheckSheetforLoops {
	
	///---------------------------------------------------------------------------------------------///
	///                            Check sheet for loops on 2/28/2025                               ///
	///            In class work to confirm topics prior to moving onto the test.                   ///
	///																								///
	///																								///
	///                                Completed By Michael Berna 									///
	///																								///
	///---------------------------------------------------------------------------------------------///
	
	public static void main(String[] args) {
		
		Random rand = new Random();   //Bring in the Math random() Method
		Scanner input = new Scanner(System.in);  //Import Scanner for number of runs of Loop 1 
		
		
//===Initialize Variables===========================================================================================
		int count = 0;  //Loop 1 Initializer
		int nestedCount;  //For Nested Loop but initialized inside the outer loop
		int value;  //For Nested Loop for holding random int for number of runs
		int sum = 0; //
		
		System.out.println("Enter the number of times to run the loop.");
		int quantity = input.nextInt();   // Number of times the loop will run

//===Start Loops====================================================================================================
		while (count < quantity) {  //Loop 1 Condition
			//--------------------------------------------------------------------------------------Loop 1 Body Start
			count += 1;  //Loop 1 Changer
			
			System.out.printf("Outer loop count: %d\n", count);  //prints the formatted count
			value = rand.nextInt(100-5)+5;  //Number of times the nested loop will run
			
			System.out.printf("Random number is: %d\n", value);  //prints the formatted value
			nestedCount = 0;  //Nested loop initializer
			
			
			while (nestedCount < value) { //Nested Loop Condition
				//-----------------------------------------------------------------------------Nested Loop Body Start
				nestedCount +=1;  //Nested Loop Changer
				System.out.printf("%d ", nestedCount); //print nested count horizontally up to the random number
				
				//-------------------------------------------------------------------------------Nested Loop Body End
			} //end of nested loop
			
			System.out.print("\n");  //Starts a new line after each outer loop
			sum += value;  //Adds the random number value to the overall sum 
			//----------------------------------------------------------------------------------------Loop 1 Body End
			
		} //end of while loop

//===Finishing Work=================================================================================================
		System.out.printf("The total is: %d", sum);  //This is the sum of all of the random values used in the nested loop
		
	} // end of main

}// end of class
