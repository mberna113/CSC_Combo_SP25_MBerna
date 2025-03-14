package Assignments;

import java.util.Arrays;

public class ArrayLab1D {

	public static void main(String[] args) {
		int [] numArray = {2, 5, 7, 11, 13, 17, 19};
		int [] cpNumArray = new int [8];
		
		for (int i = 0; i < cpNumArray.length-1; i++) {
			cpNumArray[i] = numArray[i];
		}//end for
		
		System.out.println(Arrays.toString(numArray));
		System.out.println(Arrays.toString(cpNumArray));
		
		int[] swap = swapItems(cpNumArray);
		System.out.println(Arrays.toString(swap));
		
	}//end main 

	private static int[] swapItems(int[] cpNumArray) {
		
		int temp = cpNumArray[cpNumArray.length-1];

		for (int i = cpNumArray.length-1; i >= 0; i--) {

			if (i == 0) {
				cpNumArray[0] = temp;
			}
			else{
				cpNumArray[i] = cpNumArray[i-1];
			}
			
		}
		return cpNumArray;
	}

}
