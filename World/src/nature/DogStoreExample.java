package nature;

import java.util.ArrayList;

import society.Chair;

public class DogStoreExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(d);
	
		ArrayList<FourLeggedObject> fourLeggedObjects = new ArrayList<FourLeggedObject>();
		fourLeggedObjects.add(d);
		
		Chair c = new Chair();
		fourLeggedObjects.add(c);
		
	}

}
