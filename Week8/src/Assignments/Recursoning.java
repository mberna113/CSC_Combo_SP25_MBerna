package Assignments;

import java.util.Scanner;

public class Recursoning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println(factorial(12));
		countdown(10);
		
		System.out.println("How far in the Fibinachi do you want to go? ");
		int num = input.nextInt();
		
		for (int i = 0; i <= num; i++) {
			System.out.print(fib(i) + " ");
		}
		System.out.println();
		binConverter(126);
				
		
	}//end main
	
	private static void binConverter(int n) {
		
		if(n>0) {
			binConverter(n/2);
			System.out.print(n % 2);
		}
		
		
	}
	
	
	
	
	private static int fib(int n) {
		if(n==0) return 0;
		if(n==1 || n==2)return 1;
		return fib(n-1) + fib(n-2);
	}
	
	
	private static int factorial(int n) {
		if(n==0) return 1;
		return factorial(n -1) * n;
		
	}//end factorial
	

	public static void countdown(int n) {
		if(n==0) {
			System.out.println("Blast off!");
		}else {
			System.out.println(n);
			countdown(n-1);
		}
						
	}//end countdown
	

}//end class
