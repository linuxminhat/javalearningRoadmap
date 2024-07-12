package exercise.abstractClass;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animal = {new Dog(),new Cat()};
		for(Animal testcase : animal) {
			testcase.bark();
		}
	}

}
