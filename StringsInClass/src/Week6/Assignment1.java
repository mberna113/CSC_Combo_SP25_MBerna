package Week6;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
//===Initialize variables===================================================================================
		Scanner input = new Scanner(System.in);
		String userCond;
		char cond = 'y';
		boolean doubloon = false;
		

		
		
//===Create a while loop to test different words in the doubloon method=====================================
		while (cond == 'y') {  //Start of while loop
			
			
//===Gather the test word from user=========================================================================
			System.out.println("What word would you like to test? ");
			String userWord = input.next();
			String word = userWord.toLowerCase();
			doubloon = doubloonTest(word);

			
			if (doubloon == true) {
				System.out.println("The word is a doubloon!");
			}
			else {
				System.out.println("The word is NOT a doubloon.");
			}
			
			System.out.print("\n\nWould you like to try it again? (y/n)\n");
			userCond = input.next();
			cond = userCond.charAt(0);
						
			
		}//end of while loop
		System.out.println("Thanks for playing!");
				
	}//end of main
	
	
	
	
	
	
	

	private static boolean doubloonTest(String word) {


		

		for (int i = 0; i <word.length(); i++) {  //comparing each letter in the word
			int count = 0;

			for (int j = 0; j < word.length(); j++) {  //comparing it to each letter in the same word
				if(word.charAt(i) == word.charAt(j)){  //if it is the same letter it will add one to count
					count ++;
				}
			}//end of nested for loop 2
			
			if (count !=2) {  //if it is not exactly true then it will return false and quit the method
				return false; 
			}//end of if statement
			
		} //end of For loop 1
		return true;  //if it has made it all of the way through without hitting a !=2 then it must be a doubloon
		
		
		
	}//end of doubloonTest
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
