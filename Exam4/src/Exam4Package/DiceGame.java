package Exam4Package;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class DiceGame {

	public static void main(String[] args) {
		
		ArrayList<Player> players = new ArrayList<>();
		File myFile = new File("C:\\Users\\micha\\Desktop\\School\\CSC 1060 Java\\DiceWinner.txt");
		
		// Scanner inputs at start of game
		Scanner input = new Scanner(System.in);
		System.out.println("How many sides would you like for the dice? ");
		int numSides = input.nextInt();
		Die dieOne = new Die(numSides);
		Die dieTwo = new Die(numSides);

		
		//Create Player One
		System.out.println("What is player 1's name? ");
		String playerOneName = input.next();
		Player playerOne = new Player(playerOneName, dieOne);
		players.add(playerOne);
		
		//Create Player Two
		System.out.println("What is player 2's name? ");
		String playerTwoName = input.next();
		Player playerTwo = new Player(playerTwoName, dieTwo);
		players.add(playerTwo);
		
		//Roll die for each
		for (Player player : players) {
			player.die.roll(numSides);
			System.out.println(player.getPlayer() + " rolled a " + player.getDie() + "\n");
		}
		
		//decide the winner
		decideWinner(players);
		writeWinner(myFile, players);
		
	}//end main

	private static void writeWinner(File myFile, ArrayList<Player> players) {
		

		
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			}else {
				System.out.println("File already exists");
			}
		}	
		catch (IOException e) {
			System.out.println("An error occured while creating your file. ");
			e.printStackTrace();  //Still gives out the 
		}
		
		
		try {
			int playerOneScore = players.get(0).getScore();
			int playerTwoScore = players.get(1).getScore();
			FileWriter myWriter = new FileWriter(myFile.getName());
			
			for (Player player : players) {
				myWriter.write(player.getPlayer() + " rolled a " + player.getDie() + "\n");
			}
			
			
			if (playerOneScore == playerTwoScore) {
				myWriter.write(players.get(0).getPlayer() + " and " + players.get(1).getPlayer() + " won the game");
//				System.out.println(players.get(0).getPlayer() + " and " + players.get(1).getPlayer() + " won the game");
			}
			else if (playerOneScore > playerTwoScore){
				myWriter.write("Player " + players.get(0).getPlayer() + " won the game");
//				System.out.println("Player " + players.get(0).getPlayer() + " won the game");
			}
			else {
				myWriter.write("Player " + players.get(1).getPlayer() + " won the game");
//				System.out.println("Player " + players.get(1).getPlayer() + " won the game");
			}
			myWriter.close();
		}catch(IOException e) {
			System.out.println("There was an error writing to your file");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void decideWinner(ArrayList<Player> players) {	
		int playerOneScore = players.get(0).getScore();
		int playerTwoScore = players.get(1).getScore();
		
//		System.out.println(playerOneScore);
//		System.out.println(playerTwoScore);

		
		if (playerOneScore == playerTwoScore) {
			System.out.println(players.get(0).getPlayer() + " and " + players.get(1).getPlayer() + " won the game");
		}else if (playerOneScore > playerTwoScore){
			System.out.println("Player " + players.get(0).getPlayer() + " won the game");
		}else {
			System.out.println("Player " + players.get(1).getPlayer() + " won the game");
		}
		
	}// end decideWinner

	
	
}
