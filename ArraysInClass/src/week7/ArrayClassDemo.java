package week7;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(30)+70; //30 is amount of values to go between ---- 
										  //70 shifts the range up to 
										  //This will be: 70-99 nineties asdf 
		}
		
		
		
		int[] hist = new int[3];
		// 0= 70's --- 1=80's --- 2=90's
		
		
		//int i : arr uses i as the literal value so you don't have to put the arr[i]
		for (int i : arr) {
			if (i >= 90 ) {
				hist[2] ++;
			}
			if (i >= 80 && i < 90) {
				hist[1] ++;
			}
			if (i >=70 && i < 80) {
				hist[0] ++;
			}
				
		}//end for loop
		
		
		//test for arr array	
		System.out.println(Arrays.toString(arr));
		
		//print histogram numbers
		System.out.printf("Seventies: %d\nEighties: %d\nNineties: %d\n", hist[0], hist[1], hist[2]);
		
		
	}//end of main

}//end of class
