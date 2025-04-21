package AnimalFarmPackage;

import java.util.ArrayList;

public class afDriver {

	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();

		Animal animal = new Animal(70, 200, "Annie");
		System.out.println(animal);
		animal.animalSound();
		animals.add(animal);
		
		
		System.out.println();
		
		
		Animal pig = new Pig(70, 375, "Penelope", "Pink" );
		System.out.println(pig);
		pig.animalSound();
		animals.add(pig);
		
		
		
		System.out.println();
		
		
		Animal cow = new Cow(65, 525, "Betsy");
		System.out.println(cow);
		cow.animalSound();
		animals.add(cow);
		
		System.out.println("-------------------------------------------\n\n");
		prettyPrint(animals);
		
	}//end main
	
	public static void prettyPrint(ArrayList<Animal> animals) {
		
		System.out.println("Mike's Animal Farm includes: \n");
		for (Animal animal : animals) {
			System.out.println(animal.getClass());
			System.out.println("Name: " + animal.getName() + " ");
			System.out.println("Height: " + animal.getHeight() + " ");
			System.out.println("Weight: " + animal.getWeight() + " ");
			if (animal instanceof Pig) {
				System.out.println("Color: " + ((Pig) animal).getColor());
			}
			System.out.println();
		}
	}
	
	

}//end class
