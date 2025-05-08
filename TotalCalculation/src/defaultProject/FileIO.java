package defaultProject;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


///Task
///Your task for this lab is to write a program that reads in a number of floating point values from a file, adds them together, and then prints out the total.
///It must also print out the sales tax on the total at a 5.3% rate, and the final total of the original items + sales tax.
///The input is from a file called “items.txt” and the output should be to a file called “total.txt”.

 

///Details
///Name the project TotalCalculation.
///Open the “items.txt” file.
///Read all of the values in a loop. You will need to use “hasNextDouble” for this.
///Keep a running total of the numbers in the file.
///Calculate the sub-total, tax, and final total.
///Write them out to the “total.txt” file.
///Print only two decimal points as these are monetary values.

public class FileIO {

	public static void main(String[] args) {
		File myFile = new File("C:\\Users\\micha\\Desktop\\School\\CSC 1060 Java\\items.txt");
		
		double subTotal = readSubTotal(myFile);
		
		printTotals(subTotal);
		
	}//end main

	
	
	public static double readSubTotal(File myFile) {
		double subTotal = 0;
		try {
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextDouble()) {
				subTotal += reader.nextDouble();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		return subTotal;
	}//end readSubTotal
	
	
	
	public static void printTotals(double subTotal) {
		
		//The sub-total is $72.04
		//The tax is $3.82
		//The total is $75.86
		double taxRate = 0.053;
		double tax = subTotal * taxRate;
		double finalTotal = subTotal + tax; 

		
		//$%.2f\n
		System.out.printf("The subTotal is: %.2f \n" ,subTotal);
		System.out.printf("The tax is %.2f \n" , tax );
		System.out.printf("The total is %.2f \n" , finalTotal );

		
	}
	
	
}//end of class
