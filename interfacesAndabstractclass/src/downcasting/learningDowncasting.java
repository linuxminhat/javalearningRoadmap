package downcasting;
class Animal{
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog is barking");
	}
}

public class learningDowncasting {
	public static void main(String[] args) {
		Dog myDog = (Dog) new Animal();
		myDog.makeSound();
//		if(myDog instanceof Animal) {
//			myDog.makeSound();
		}
		
	}


