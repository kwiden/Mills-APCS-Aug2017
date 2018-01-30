
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

	public void display() {
		System.out.print("type: " + this.type + " weight: " + this.weight + " ");
		if (this.weight > 50)
			makeSound(true);
		else
			makeSound(false);
		makeSound(); // overloaded method, in super class
	}

}
