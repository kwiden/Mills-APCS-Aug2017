
public class ZooRunner {

	public static void main(String[] args) {
		Dog fluffy = new Dog("Poodle");
		fluffy.setWeight(20.0);
		System.out.println("Test display");
		fluffy.display();
		Dog rover = new Dog("German Shepherd");
		Zoo newyork = new Zoo("Bronx Zoo");
		Mammal george = new Mammal();
	//	george.makeSound("growl"); // Will not work as this method form is at subclass level
		System.out.println("\nTest downcasting in Zoo");
		newyork.addAnimal(rover);
		Animal fifi = new Dog();
		fifi.setType("Doggie");
		System.out.println("\nTest downcasting in animal");
		((Dog)fifi).display();
	}

}
