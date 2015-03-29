package SubClassSuperClass;

public class Dog extends Animal {

	private String breed;
	private String name;
	private int age;
	
	// Getting to know the static Keyword
	public static int numOfDogs = 0;
	
	public Dog() {
		name = "Don't have a name";
		breed = "I don't know my breed yet";
		age = 0;
		// so this int will increase whenever we make a dog object
		numOfDogs++;
	}
	
	public Dog(String breed, String name, int age) {
		this.breed = breed;
		this.name = name;
		this.age = age;
		// so this int will increase whenever we make a dog object
		// to get the number of dogs created, in our main class we have to use the nameOfThisClass.numOfDogs
		numOfDogs++;
	}
	
	public void introduce() {
		System.out.println("Hi my name is " + name + " I am a " + breed + " and I am " + age +  " years old");
	}

	// You can change the default value of the isAnimal method that is in your Animal class 
	// or add ontop of it as I have done here.
	public void isAnimal() {
		// TODO Auto-generated method stub
		super.isAnimal();
		System.out.print(" I am a dog");
	}
	
	
	
}
