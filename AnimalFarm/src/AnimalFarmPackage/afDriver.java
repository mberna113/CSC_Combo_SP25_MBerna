package AnimalFarmPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class afDriver {

	public static void main(String[] args) {
		
		File myFile = createFile(); // create the file (if it doesn't exist)
		ArrayList<Animal> animals = readFile(myFile);  // Create the animals array but use the readFile to populate it from the txt file. 
		inputNew(animals);
		writeFile(myFile, animals);  // This will call the write file that will print out a txt file to the local directory
		
		
		prettyPrint(animals);
		
	}//end main
	
	private static void inputNew(ArrayList<Animal> animals) {
		Scanner input = new Scanner(System.in);
		Animal ani;
		Boolean cont = false;
		System.out.println("Would you like to add an Animal? ");
		String userCont = input.next();
		if (userCont.contains("yes") || userCont.contains("Yes") || userCont.contains("YES")) {
			cont = true;
		}
		
		while (cont) {
			System.out.println("What is the animal type? (Cow, Pig, or just Animal)");
			String type = input.next();
			System.out.println("What is the height?");
			int height = input.nextInt();
			System.out.println("What is the weight?");
			int weight = input.nextInt();
			System.out.println("What is the animal's name?");
			String name = input.next();
			if (type.equals("Pig")) {
				System.out.println("What is the color?");
				String color = input.next();
				ani = new Pig(height, weight, name, color);
			}
			else if (type.equals("Cow")) {
				ani = new Cow(height, weight, name);
			}
			else {
				ani = new Animal(height, weight, name);
			}
			animals.add(ani);
			
			System.out.println("Would you like to add another? ");
			userCont = input.next();
			if (userCont.contains("yes") || userCont.contains("Yes")) {
				cont = true;
			}else cont = false;
			
		}//end while
		
	} //end method 

	
	public static ArrayList<Animal> readFile (File myFile) {
		ArrayList<Animal> animals = new ArrayList<>();
		Animal ani;
		try {
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextLine()) {
				String type = reader.nextLine();
				int height = Integer.parseInt(reader.nextLine());
				int weight = Integer.parseInt(reader.nextLine());
				String name = reader.nextLine();
				if (type.equals("Pig")) {
					String color = reader.nextLine();
					ani = new Pig(height, weight, name, color);
				}
				else if (type.equals("Animal")) {
					ani = new Animal(height, weight, name);
				}
				else {
					ani = new Cow(height, weight, name);
				}
				animals.add(ani);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		return animals;
	}
	
	
	public static void prettyPrint(ArrayList<Animal> animals) {
		
		System.out.println("\nMike's Animal Farm includes: \n");
		for (Animal animal : animals) {
			System.out.println("Type: " + animal.getType() + " ");
			System.out.println("Name: " + animal.getName() + " ");
			System.out.println("Height: " + animal.getHeight() + " ");
			System.out.println("Weight: " + animal.getWeight() + " ");
			if (animal instanceof Pig) {
				System.out.println("Color: " + ((Pig) animal).getColor());
			}
			System.out.println();
		}
	}

	
	public static File createFile() {
		File aFarm = new File("AnimalFarm.txt");
		try {
			if (aFarm.createNewFile()) {
				System.out.println("File created: " + aFarm.getName());
			}else {
				System.out.println("File already exists");
			}
		}	
		catch (IOException e) {
			System.out.println("An error occured while creating your file. ");
			e.printStackTrace();  //Still gives out the 
		}
		return aFarm;
	}

	
	public static void writeFile(File myFile, ArrayList<Animal> animals) {
		try {
			FileWriter myWriter = new FileWriter(myFile.getName());
			for (Animal animal : animals) {
//				myWriter.write("----- " + animal.getName() + "'s Stats -----\n");
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getHeight() + "\n");
				myWriter.write(animal.getWeight() + "\n");
				myWriter.write(animal.getName() + "\n");  // commented out to give better formatting
				if (animal.getType().equals("Pig")) {
					myWriter.write(animal.getColor() + "\n");
				}
				
			}
//			myWriter.write("----- End of List -----\n");
			myWriter.close();
		}
		catch (IOException e) {
			System.out.println("There was an error writing to your file");
			e.printStackTrace();
		}
		System.out.println("Data successfully added to " + myFile.getName() + ". ");
	}



	
}//end class
