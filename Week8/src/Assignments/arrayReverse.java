package Assignments;


import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		
		//Create an array with user numbers
		int[] arr = new int[10];
		int num = 0;
		int i = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Type a number to add to the list: (%d of 10)\n", i+1);
		num = input.nextInt();
		
		//Populate array
		while (num != -1) {			
			if (num ==-1) {
				break;
			}
		    arr[i] = num;
		    i++;
		    if (i > arr.length-1) {
				break;
			}
		    System.out.printf("Type a number to add to the list: (%d of 10)\n", i+1);
			num = input.nextInt();
//		    System.out.printf(": %d\n",num);
		}
		
		int [] arrFinal = new int [i];
		
		for (int t=0; t < arrFinal.length; t++) {
			arrFinal[t] = arr[t];
		}
		
	    System.out.println("Here are the numbers you entered. ");
	    System.out.println(Arrays.toString(arrFinal));
	    System.out.println();
		//Send the array out to be reversed
	    int [] reverse = Reverse(arrFinal);
	    System.out.println("Here are the numbers reversed. ");
		System.out.println(Arrays.toString(reverse));
		
	}//end main
	
	
	private static int[] Reverse(int[] arr) {
		int [] reverse = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			reverse [i] = arr[ arr.length - (i +1) ];
		}
		
		
		return reverse;
	}//end of Reverse

	
}//end of class

