package upcasting;

class Animal {
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
}
class Dogs extends Animal{
	public void makeSound() {
		System.out.println("Dog is barking");
	}
}

public class learning_upcasting {
	public static void main(String[] args) {
		Animal thisAnimal = new Dogs();
		thisAnimal.makeSound();//safe 
	}

}
