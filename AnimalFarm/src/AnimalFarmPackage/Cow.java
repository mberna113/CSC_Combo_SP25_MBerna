package AnimalFarmPackage;

public class Cow extends Animal{
	
	private String type;
	
	
	public String getType() {
		return this.type;
	}

	public Cow(int height, int weight, String name) {
		super(height, weight, name);
		this.type = "Cow";
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
