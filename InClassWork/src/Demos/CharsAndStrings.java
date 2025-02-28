package Demos;

import java.util.Scanner;

public class CharsAndStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//--------------------------------------------------------------------------------------------------------------
//		System.out.println("Roman Alphabet: ");
//		
//		for (char c = 'A'; c <= 'Z'; c++) {
//			//System.out.print(c + " ");
//			System.out.println("ASCII numbers: " + c + " = " + (int)c);
//			
//		}
//		
//		System.out.println();
//		
//		System.out.println("Greek Aplabet: ");
//		for (int i = 913; i <= 937; i++) {
//			System.out.print((char)i + " ");
//			
//		}
//-------------------------------------------------------------------------------------------------------------
//		System.out.println();
//		System.out.println("Enter a number:");
//		while (!input.hasNextDouble()) {
//			String word = input.next();
//			System.out.println(word + " is not a nubmer! ");
//			System.out.println("Enter a number!!");
//			
//		}
//		System.out.println();
//		double number = input.nextDouble();
//		System.out.println("Your double number was: " + number);
//		
//		
//-------------------------------------------------------------------------------------------------------------
//		String fruit = "blackberry";
//		for (int i = 0; i < fruit.length(); i ++) {
//			char letter = fruit.charAt(i);
//			System.out.println(letter);
//		}
		
//		char lastletter = fruit.charAt(fruit.length() - 1);
////		System.out.println("The last letter is: " + lastletter);
//		
//		
//		String fruitReversed = reverse(fruit);
//		System.out.println(fruitReversed);
//		
////-------------------------------------------------------------------------------------------------------------
//		System.out.println("the letter b appears first at index " + fruit.indexOf('b'));
//		System.out.println("the letter b appears second at index " + fruit.indexOf('b', 1));
//		System.out.println("the letter b appears last at index " + fruit.lastIndexOf('b'));
//		
////-------------------------------------------------------------------------------------------------------------
//
//		System.out.println(fruit.substring(0, 5));
//		System.out.println(fruit.substring(5));
//		System.out.println(fruit.substring(5, fruit.length()));

//		System.out.println("Play again?");
//		String ans = input.next();
//		if (ans.equals("yes")) {
//			System.out.println("Lets Go!!!");
//		}
//		else {
//			System.out.println("Goodbye. ");
//		}
		
////-------------------------------------------------------------------------------------------------------------
	
//		String name1 = "Ada Lovelace";
//		String name2 = "Alan Turning";
//		int diff = name1.compareTo(name2);
//		
//		if (diff > 0) {
//			System.out.println("Name 2 is before Name 1");
//		}
//		else if (diff < 0) {
//			System.out.println("Name 1 is before Name 2");
//		}
//		else {
//			System.out.println("Name 1 is the same as Name 2");
//
//		}
//		
////-------------------------------------------------------------------------------------------------------------

		
		
		int hour = 18;
		int minute = 23;
		
		System.out.println("Enter the military time hour: ");
		hour = input.nextInt();
		System.out.println("Enter the military time minutes: ");
		minute = input.nextInt();
		
		System.out.printf("The military time of %02d%02d is known as " + timeString(hour, minute), hour, minute );
		
		
		
		
		
		
		
		
		
		
		
		
	} //out of main

	private static String timeString(int hour, int minute) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour ==0) {
				hour = 12;
			}
		}
		else {
			ampm = "PM";
			hour = hour - 12;			
		}
		return String.format("%02d:%02d %s",  hour, minute, ampm);
	}
	
	
	
	
	
	
	
	
	
////-------------------------------------------------------------------------------------------------------------

//	private static String reverse(String fruit) {
//		String r = "";
//		for (int i = fruit.length() - 1; i >= 0; i--) {
//			r += fruit.charAt(i);
//		}
//		return r;
//	}

}
