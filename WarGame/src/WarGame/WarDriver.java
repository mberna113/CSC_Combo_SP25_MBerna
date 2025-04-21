package WarGame;

public class WarDriver {   
	
///------------------------------------------This is the Driver to actually play War--------------------------------------------------------///
///----------------------------------------wherever the main is located is the driver-------------------------------------------------------///
	
///----------------------------------------------Start main--------------------------------------------------------------------------------///
	public static void main(String[] args) {   
		
		Deck deck = new Deck();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));
		
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		
		Pile center = new Pile();
		
		
		
		/// Create one pile of center that will hold all of the cards in the hand. 
		///if a tie happens just add extra cards to the hand and restart at the top of the hand
		///the next round will have the previous hand plus the extras in it 
		///if there are more ties they will all be pushed into a bigger center pile. 
		
		
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			
			center.addCard(c1);
			center.addCard(c2);
			
			int diff = c1.getRank() - c2.getRank();
			System.out.println(c1 + " vs " + c2);
			
			
			
			if (diff > 0) {   // player 1 has a bigger card
				while (!center.isEmpty()) {
					p1.addCard(center.popCard());
				}
			}
			else if (diff < 0) {  // player 2 has bigger card
				while (!center.isEmpty()) {
					p2.addCard(center.popCard());
				}
			}
			else {  //else to leave blank for now
				for (int i = 0; i <= 3; i++) {
					if (!p1.isEmpty() && !p2.isEmpty()) {
						center.addCard(p1.popCard());
						center.addCard(p2.popCard());	
					}
				}
			}
		} //end while loop
		
		
		//End Game Printouts 
		if (p2.isEmpty()) {
			System.out.println("Player 1 Wins!!!");
		}
		else {
			System.out.println("Player 2 Wins!!!");
		}
		

		
	}
///-----------------------------------------------------end main----------------------------------------------------------------------///

	
	


	
	public static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
			System.out.println(cards[i]);
		}
		return -1;
	}
	
	public static int binarySearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		
		while (low <= high) {    //while we are still working toward the middle
			int mid = (low + high) / 2;   //resets the new mid from high and lows
			int compare = cards[mid].compareTo(target);
			System.out.println(cards[mid]);
			
			if (compare == 0) {   //if compareTo is the same it is a 0
				return mid;
			}
			else if (compare < 0) {
				low = mid + 1;
			}
			else if (compare > 0) {
				high = mid - 1;
			}
			
		}//end while
		
		return -1;
	}
	
	public static void printDeck(Card[] cards) {
		if (cards[0] == null) {
			System.out.println("There are no cards yet!");
		}
		
		for(Card card : cards) {
			System.out.println(card);
		}
	}
	
	public static void makeDeck(Card[] cards) {
		int index = 0;
		for (int suit = 0; suit < 4; suit ++) {
			for(int rank = 1; rank <= 13; rank ++) {
				cards[index] = new Card(rank, suit);
				index ++; 
			}
		}
				
	}//end makeDeck
	
	
	
	
	
}//end class WarDriver
