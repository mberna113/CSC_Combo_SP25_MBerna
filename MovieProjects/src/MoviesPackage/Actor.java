package MoviesPackage;

import java.util.Scanner;

public class Actor {
	Scanner input = new Scanner(System.in);
	private String name = "";
	private int numofActors;
	
	public Actor(int numofActors, ) {
		for (int i = 0; i < numofActors; i++) {
			actorlist[i] = input.next();
			
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}
	
	
	
	
	
	
}
