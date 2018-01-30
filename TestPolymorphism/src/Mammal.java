
public class Mammal extends Animal {
	double weight;

	public Mammal() {

	}

	public Mammal(double pounds) {
		this.weight = pounds;
	}

	public void makeSound() {
		System.out.println("moo");
	}

	public void setWeight(double w) {
		this.weight = w;
	}
}
