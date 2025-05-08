package Exam4Package;

import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	
	
	
	
	public Die() {
		this.numSides = 6;
		this.value = 1;
	}

	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1;
	}
	
	public void roll(int numSides) {
		Random rand = new Random();
		this.value = rand.nextInt(1, numSides + 1);
	}

  	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		return value + " on a " + numSides + "-sided die";
		//Need to look at how this is printed out later
	}
	
	
	
	
}
