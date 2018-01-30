
public class Zoo {
	String zooName;

	public Zoo(String n) {
		this.zooName = n;
	}

	public void addAnimal(Animal a) {
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.makeSound(true);
		}
	}
}
