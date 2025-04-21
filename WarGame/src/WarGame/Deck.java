package WarGame;

import java.util.Random;

public class Deck {
	private Card[] cards;
	private static Random rand = new Random();
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	public Deck(int n) {
		this.cards = new Card[n];
		
	}
	
	public Deck subDeck(int low, int high) {
		Deck sub = new Deck (high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	
	public void selectionSort() {
		for (int i = 0; i < cards.length; i++) {
			int lowest = indexLowest(i,  cards.length);
			swap(i, lowest);
		}
	}

	private int indexLowest(int low , int high) {
		int lowest = low;
		
		//find and return the lowest card between low and high
		for (int i = low; i < high; i++) {
			if (cards[i].compareTo(cards[lowest]) < 0) lowest = i;
		}
		return lowest;
	}
	
	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			
			int rNum = randomInt(i, this.cards.length-1);
			swap(i, rNum);
			//choose a random number between i and length -1
			//swap the i'th card with the randomly-chosen card
		}
	}
	
	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}
	
	private  int randomInt(int low, int high) {
		return rand.nextInt(high-low + low);
	}
	
	public Card[] getCards() {
		return this.cards;
	}

	public void print() {
//		int index = 1;   //for numbered cards
		for(Card card : this.cards) {
//			System.out.printf("%d: ", index);   //for numbered cards
			System.out.println(card);
//			System.out.print("\n");   //for numbered cards
//			index ++;   //for numbered cards
		}
			
	}


	
	
	
	
	
}// end of Deck
