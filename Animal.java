package Animal;

public class Animal {
	private final int numberOfEyes;
	private int numberOfLegs;
	private String animalColour;
	
	public Animal(int numberOfEyes, int numberOfLegs, String animalColour) {
		this.numberOfEyes = numberOfEyes;
		this.numberOfLegs = numberOfLegs;
		this.animalColour = animalColour;
	}
	
	public void moving(){
		System.out.println("Moving...");
		String cat = "animal", dog = "animal";
		
	}
	public void makeSound(){
		System.out.println("making Sound");
	}
}

