package SubClassSuperClass;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Before we made any dog objects: " + Dog.numOfDogs);
		Dog dog1 = new Dog("King Charles", "Rex", 4);
		Dog dog2 = new Dog("King Charles", "Rex", 6);
		
		dog1.introduce();
		dog1.isAnimal();
		System.out.println();
		dog2.introduce();
		dog2.isAnimal();
		System.out.println();
		System.out.println("After we made any dog objects: " + Dog.numOfDogs);
	}
}
