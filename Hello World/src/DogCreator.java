



public class DogCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		
		dog1.setLegs(4);
		dog1.setTail(true);
		dog1.setHair("furry");
		
		System.out.println("This dog has "+dog1.getLegs()+" legs.");
		System.out.println("Does this dog have a tail? " +dog1.getTail());
		System.out.println("This dog has "+dog1.getHair()+" hair.");
		
	}

}
