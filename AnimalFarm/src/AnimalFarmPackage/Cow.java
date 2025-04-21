package AnimalFarmPackage;

public class Cow extends Animal{

	public Cow(int height, int weight, String name) {
		super(height, weight, name);
	}

	@Override
	public void animalSound() {
		System.out.println("The cow says moo moo moo!");
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + "Cow []";
	}
	
	
}
