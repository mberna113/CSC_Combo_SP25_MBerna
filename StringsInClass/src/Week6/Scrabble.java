package Week6;

import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the tile letters (without spaces):");
		String userTiles = input.next();
//		String userTiles = "quijibo";
		String tiles = userTiles.toLowerCase();
		
		
		char play = 'y';
		
		while (play == 'y') {
			

			System.out.println("What word would you like to try to make?: ");
			String userWord = input.next();
//			String userWord = "job";
			String word = userWord.toLowerCase();
			
			
			
			boolean endWord = canSpell(word, tiles);
			
			if (endWord == true) {
				System.out.printf("\n\nThat will work!\n You can spell \"%s\" with the tiles \"%s\" \n", word, tiles);
			}
			else {
				System.out.print("That word will not work\n");
			}
			
			System.out.print("\nWould you like to try another word? (y/n)\n");
			String userPlay = input.next();
			play = userPlay.toLowerCase().charAt(0);
			
		}
		System.out.println("Thanks for playing!");
		
	} //end of main 
	
	
	
	

	private static boolean canSpell(String word, String tiles) {

		boolean found = false;
		
		
		for (int i = 0; i < word.length(); i++) {
			found = false;
			for (int j = 0; j < tiles.length(); j++) {
				if ( word.charAt(i) == tiles.charAt(j)) {
					found = true;	
				}
				
			}
			if (!found) {
				return false;
			}
		}
		return true;
	
	
	}

}
