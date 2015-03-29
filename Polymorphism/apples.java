// If you forget how polymorphism works look at these videos: https://www.youtube.com/watch?v=0xw06loTm1k  https://www.youtube.com/watch?v=KKbN5pjBZGM

package Polymorphism;

public class apples {
	
	public static void main(String[] args) {
		food[] bucky = new food[2];
		bucky[0] = new tuna();
		bucky[1] = new potpie();
		
		for(food obj : bucky) {
			obj.eat();
		}
		
		fatty bucky1 = new fatty();
		food fo = new food();
		
		bucky1.digest(fo);
		
	}
}
