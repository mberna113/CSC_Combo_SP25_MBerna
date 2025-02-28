package Loops;

import java.util.Scanner;

public class RightAngleLoop {

	public static void main(String[] args) {
		
		//Starting info message:
		System.out.println("Input number of rows: ");
		
		//call the getUserNumber method and return it as an int
		int userNum = getUserNumber();
		
		//goes through each row
		for (int row = 0; row <= userNum; row++) {
			
			//within each row.... add up the numbers until you equal row
			for (int num = 1; num <= row; num++) {
				System.out.print(num);
			}
			//break each row with a newline
			System.out.print("\n");
		}
	}

	
	//Method of getUserNumber to be used to actually collect the number of rows needed
	private static int getUserNumber() {
		//import Scanner in Method to keep it separated from other work (as a trial)
		Scanner input = new Scanner(System.in);
		
		//accept input from user to userNum
		int userNum = input.nextInt();
		
		//return the userNum as an int
		return userNum;
	}

}


