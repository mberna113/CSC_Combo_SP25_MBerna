package WarGame;

///------------------------------------------This is the builder for the back-end of War--------------------------------------------------------///

public class Card {
	private final int rank; 
	private final int suit;
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	
 	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	
	public boolean equals(Card that) {
		return this.rank == that.rank & this.suit == that.suit;
	}

	
	public int compareTo(Card that) {   //---------Book has the suits as a higher precedence over the number-------------
		if (this.suit < that.suit) return -1;   //toggle these to change it back.
		if (this.suit > that.suit) return 1;    //toggle these to change it back.
		if (this.rank < that.rank) return -1;
		if (this.rank > that.rank) return 1; 
//		if (this.suit < that.suit) return -1;   //toggle these to change it back.
//		if (this.suit > that.suit) return 1;    //toggle these to change it back. 
		return 0;
	}
	  

	
	public int getRank() {
		return rank;
	}

	
	public int getSuit() {
		return suit;
	}


	@Override
	public String toString() {   //toString should always be at the bottom

		
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}
	



}//end of Card class 
