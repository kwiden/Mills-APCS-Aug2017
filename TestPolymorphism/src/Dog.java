
public class Dog extends Mammal {
	String breed = "Mutt";
	public Dog() {
		setType("Dog");
	}

	public Dog(String breed) {
		this();
		this.breed = breed;
	}

	public void makeSound(boolean isLarge) {
		if (isLarge)
			System.out.println("Woof");
		else
			System.out.println("Yap");
	}
}
