package chap08;

public class Polymorphism02 {

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.animalSound();
		
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		myDog.eat();
		
	}

}
