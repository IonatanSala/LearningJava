package Lab2;

import java.util.Random;

public class Stick {

	private int n; // The number of times to break the stick
	private double stickLength; // The initial length of your stick
	private double[] stickArray; // Store all your broken sticks into this array
	private Random randomGenerator = new Random(); // Random generator that creates a random number to break of stick
	
	// constructor
	public Stick(int n, double stickLength) {
		this.n = n;
		this.stickLength = stickLength;
		stickArray = new double[n+1];
		
	}
	
	
	/**
	 * This method breaks your stick n number of times randomly and puts them in the stickArray and returns them
	 * 
	 * @return stickArray - this is the array with all the broken parts from the stick
	 */
	public double[] getSticksArray() {
		
		stickArray[0] = stickLength; // Your stick before it gets broken
		for(int i = 0; i<stickArray.length-1; i++) {
			int whatStickToBreak = randomGenerator.nextInt(i+1);	// this gets a random stick to break
			double newStick = (randomGenerator.nextDouble()*stickLength) % stickArray[whatStickToBreak]; // breaks the random stick in two randomly
			double stick1 = stickArray[whatStickToBreak] - newStick;	// update your old stick now since it got broken
			
			stickArray[whatStickToBreak] = stick1;	// update your old stick to its new value
			stickArray[i+1] = newStick;	// put your new stick into array.
		}
		return stickArray;
	}
	
	/**
	 * This method checks if any 3 of the randomly broken sticks you created in the getSticksArray() can be formed
	 * to make a triangle.
	 * @return check - either true or false based on whether its possible to make triangle or not
	 */
	public boolean checkIfYouCanMakeTriangle() {
		boolean check = false;
		
		for(int i = 0; i<stickArray.length-2; i++) {
			for(int j = i+1; j<stickArray.length - 1; j++) {
				for(int k = j+1; k<stickArray.length; k++) {
					
					// This if statment checks if any three sticks can be put together to make a triangle
					if((stickArray[i] + stickArray[j]) > stickArray[k] && (stickArray[i] + stickArray[k]) > stickArray[j] &&
							(stickArray[k] + stickArray[j]) > stickArray[i]) {
						check = true;
					}

				}
			}
		}
		
		return check;
	}
	
	
	
	
	
	
}
