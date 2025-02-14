package bottlesofthings;

public class NBottles {

	public static void main(String[] args) {
		
		for (int bottles = 9; bottles > 0; bottles = bottles - 1 ) {
			System.out.printf("%d bottles of thing on the wall.\n%d bottles of thing.\n"
					+ "Take one down and pass it around.\n"
					+ "%d bottles of thing on the wall.\n", bottles, bottles, bottles - 1);
			bottles = bottles - 1;
		}
 
	}

}
