
import model.*;


public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());	
		Dog max = new Dog("Max", 5, "Golden Lab");
		System.out.println(max.speak());
		Bird charlie = new Bird();
		System.out.println(charlie.speak());
		Zebra joe = new Zebra();
		System.out.println(joe.speak());
		Frog Kermit = new Frog("Kermit",2,"Green");
		System.out.println(Kermit.speak());
		Snake ramses = new Snake("Ramses", "Python", false);
		System.out.println(ramses.speak());
		Lion Mufasa = new Lion("Mufasa", 25, 240);
		System.out.println(Mufasa.speak());
		Llama tina = new Llama("Tina", "Fat Lard", "Eating dinner");
		System.out.println(tina.speak());
    

   	}

}

