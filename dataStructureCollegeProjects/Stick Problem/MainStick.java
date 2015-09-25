package Lab2;

public class MainStick {
	
	public static void main(String[] args) {
		
		int numberOfSticks = 1000000;	// How many stick do you want to break
		int lengthOfEachStick = 20;	// The length of your stick;
		int n = 2
				; // How many times do you want to break your stick
		
		Stick[] sticks = new Stick[numberOfSticks];
		
		int count = 0;	// increments every time you can make a triangle
		
		
		for(int i = 0; i<sticks.length; i++) {
			sticks[i] = new Stick(n,lengthOfEachStick);
			double[] array = sticks[i].getSticksArray();
			
			 // Prints out your the actual numbers you get
//			for(double k : array) {
//				System.out.println(k);
//	
//			}
//			System.out.println(sticks[i].checkIfYouCanMakeTriangle());
//			System.out.println("");
			
			// if you can make a triangle out of the sticks count++
			if(sticks[i].checkIfYouCanMakeTriangle()) count++;
		}
		
		
		// prints out the probability of making a triangle.
		double probability = ((double)count/(double)sticks.length)*100;
		
		
		System.out.println(probability + "%");
		
		

		
	}
		
		

}
