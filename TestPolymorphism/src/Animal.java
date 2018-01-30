
public class Animal {
	String type;

	public Animal() {

	}
	public void setType(String t) {
		this.type = t;
		if (this instanceof Dog) {
			Dog d = (Dog) this;
			d.breed = "Mutt";
		}
	}
}
