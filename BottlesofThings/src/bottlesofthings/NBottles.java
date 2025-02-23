package bottlesofthings;

import java.util.Scanner;

public class NBottles {

	public static void main(String[] args) {
		
		
		//Start with message and input for new number
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles should we start with?");
		int startNum = input.nextInt();
		
		
		
		//main for loop to run through the numbers
		for (int bottles = startNum; bottles > 0; bottles -- ) 
		{
			System.out.printf("%d bottles of thing on the wall.\n%d bottles of thing.\n"
					+ "Take one down and pass it around.\n"
					+ "%d bottles of thing on the wall.\n\n", bottles, bottles, bottles - 1);
			
			//nested if statement to determine if it is the last bottle verse
			//adds in the last line to go to the store and start with the same number
			if(bottles == 1 ) 
			{
				System.out.printf("Run to the store, to buy up some more.\n"
						+ "%d more bottles of thing on the wall!", startNum); 
			}
		}
 
	}

}
