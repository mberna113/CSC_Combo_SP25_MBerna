package WarGame;

import java.util.ArrayList;
import java.util.Iterator;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {		// this is the constructor (same name as class and method that uses no inputs
		this.cards = new ArrayList<Card>();
	}
	
	public Card popCard() {
		return this.cards.remove(0);
	}
	
//	public Card drawThree() {
//		this.cards.remove(0);
//		return cards;
//	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards()) {
			this.cards.add(card);
		}
	}
	
}
