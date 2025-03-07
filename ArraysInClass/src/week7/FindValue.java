package week7;

import java.util.Arrays;
import java.util.Random;

public class FindValue {

	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[50];
		
 		//populate the arr with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
		}
		System.out.println(Arrays.toString(arr));
		
		int target = 3;
		
		boolean found = FindValue(arr, target);
		
		if (found) {
			System.out.println("You found it! ");
		}else {
			System.out.println("Not this time");
		}
	}

	private static boolean FindValue(int[] arr, int target) {
		for (int i : arr) {
			if (i == target) {
				return true;
			}
		}
		return false;
	}

	

}
