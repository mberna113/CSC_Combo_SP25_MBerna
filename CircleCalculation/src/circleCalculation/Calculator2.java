package circleCalculation;

import java.util.Scanner;
/***********************************************************************************************
 * This is a simple calculator application. It will add, subtract, multiply or divide
 * two numbers. The first number will be operated on by the second.
 * 
 * There will be a method for each operation. 
 * 
 * @author Michael Berna
 * 
 * 
*************************************************************************************************/


public class Calculator2 {

	public static void main(String[] args) {
		//Class demo of the calculator
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Calculator!\n");
		System.out.println("Enter what operation you would like to preform. ");
		System.out.println("Addition (add), Subtraction (sub),"
				+ " \nMultiplication (mult), Division (div), Powers(pow).");
		
		String operation = input.next();
		
		System.out.println("Enter the two whole numbers: ");		
		double num1 = input.nextDouble();			
		double num2 = input.nextDouble();

		//switch on which operation should be completed
		switch(operation) {
		case "add":     //This will apply the following if the case is true
			System.out.printf("%f added to %f equals:\n %.2f", num1, num2, add(num1, num2));
			break; // break means that no other cases will run
		case "sub":
			System.out.printf()); sub(num1, num2);  
			
			//START HERE TO CONTINUE
			
			break;
		case "mult":
			mult(num1, num2);
			break;
		case "div":
			div(num1, num2);
			break;
		case "pow":
//			findPow(num1, num2);
			System.out.println(findPow(num1, num2)); //This is the way to do the Modules !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			break;
		default:
			System.out.println("Invalid Entry");
		}
		

		
		
		
		
	}// end of main

//	private static void print(double ans) {
//		// create a print method that will handle all ans from different modules. 
//		System.out.printf("The answer is: %.3f", ans);
//		return;		
//	} 

	private static double findPow(double num1, double num2) {
//		System.out.printf("%f to the power of %f equals:\n %.2f", num1, num2, Math.pow(num1, num2));
		double ans = Math.pow(num1, num2);
		return ans;
	}

	private static double div(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("You can't divide by zero");
			return num2;
		}
		double ans = num1 / num2;
		return ans;
//		System.out.printf("%f divided by %f equals:\n %.2f", num1, num2, num1 / num2);
		 
		
	}

	private static double mult(double num1, double num2) {
		double ans = num1 * num2;
		//		System.out.printf("%f multiplied by %f equals:\n %.2f", num1, num2, num1 * num2);
		return ans;
	}

	private static double sub(double num1, double num2) {
		double ans = num1 - num2;
//		System.out.printf("%f subtracted by %f equals:\n %.2f", num1, num2, num1 - num2);
		return ans;
	}

	private static double add(double num1, double num2) {
		double ans = num1 + num2;
//		System.out.printf("%f added by %f equals:\n %.2f", num1, num2, num1 + num2);
		return ans;
	
	}

}
