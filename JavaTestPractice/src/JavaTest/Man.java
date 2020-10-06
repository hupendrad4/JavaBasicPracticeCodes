package JavaTest;

public class Man extends Animal {

	public static void main(String[] args) {
		Man man = new Man();
		man.legs();
		// No need to create the object of class Animal as we are inheriting (extending
		// the Animal class)

		// Animal animal = new Animal();
		// animal.sound();
		man.sound();
		man.legs();
	}

	public void legs() {

		System.out.println("Man has 2 legs ");
	}
	// Overridding the sound method from class Animal
	public void sound() {
		System.out.println("Talks ");
	}

}
