package interactiveGreeter;

import java.util.Scanner;

public class interactiveGreeterClass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		
		String fName = input.next();
		
		System.out.println("What is your last name?");
		
		String lName = input.next();
		
		System.out.println("Hello " + fName + " " + lName + "!");
		System.out.println("It's great to meet you. I can't wait to get to know you.");
		
		System.out.println("Where are you from?");
		
		String fromLoc = input.next();
		
		System.out.println("I have heard that " + fromLoc + " is a great place to live!");
		
		System.out.println("How old are you?");
		
		int agePerson = input.nextInt();
		
		System.out.println("Wow only " + agePerson + " years young!");
		
		System.out.println("What does a " + agePerson + " year old like to do?");
		
		String actPerson = input.next();
		
		System.out.println("I have heard that people that " + actPerson + " are also very generous.");
		System.out.println("How much would you like to donate to our project?");
		
		int donateRate = input.nextInt();
		
		System.out.println("Wow, thanks for supporting us with your $" + donateRate + " donation!");
		input.close();
	
	}
}
