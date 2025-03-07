package week7;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int [] reverse = Reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverse));
		inlineRev(reverse);
		System.out.println(Arrays.toString(reverse));
		}

	private static int[] Reverse(int[] arr) {
		int [] rev = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			rev [i] = arr[ arr.length - (i +1) ];
		}
		
		
		return rev;
	}
	public static void inlineRev(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i]; 
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp; 
		}
		
	}
}
