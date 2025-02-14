package checkSheetForInput;

import java.util.Scanner;
 
public class CheckSheet {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		String word, upperWord;
		int intNum;
		float realNum, test;
		double biggerRealNum;
		char letter;
		
//		test = 987654321.987654321f;
//		test = test + test;
//		System.out.printf("%.9f", test);
		
		System.out.print("Type some words in here:");
		word = input.nextLine();
		System.out.printf("The word(s) you chose was %s\n\n", word);
		
		//change to upper case
		upperWord = word.toUpperCase();
		System.out.println(upperWord);
		
		
		System.out.println("Type an integer in here:");
		intNum = input.nextInt();
		System.out.printf("The integer you picked was %d\n\n", intNum);
		
		
		System.out.println("Type a number with a decimal here:");
		realNum = input.nextFloat();
		System.out.printf("The number with a decimal you picked was: %.3f\n\n", realNum);
		
		
		System.out.println("Type a BIG number with here with decimals if you want");
		biggerRealNum = input.nextDouble();
		System.out.printf("The BIG number you typed was: %f\n\n",biggerRealNum);
		
		System.out.println("Type in your favorite letter.");
		letter = input.next().charAt( 0 );
		System.out.printf("Your favorite letter is: %c", letter);
		
		
		
		System.out.print("\n\n Your done!");
		input.close();
	}

}
