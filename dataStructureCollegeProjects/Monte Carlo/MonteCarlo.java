package Lab1;

import java.util.Random;

public class MonteCarlo {
	
	private int arraySize; 	// array size
	private int[] array; 	// array
	private Random randomGenerator = new Random();	// Random generator
	
	// constructor
	public MonteCarlo() {
		
		arraySize = 6;
		array = new int[arraySize];
	}
	
	// Creates a random array
	public void setArray() {
		
		// fills your array with random generated number from 1 - 45.
		for(int i =0; i<array.length; i++) {
			int randomNumber = randomGenerator.nextInt(45)+1;
			array[i] = randomNumber;
		}
		
		// Checks to see if there are any duplicates in your ticket.
		// If there are then you generate another random number in their
		// place until you have a random generated array with no doubles.
		boolean check = false;
		while(!check) {
			check = true;
			for(int j = 0; j<array.length; j++) {
				for(int k = 0; k<array.length; k++) {
					if(array[j] == array[k] && j != k) {
							array[k] = randomGenerator.nextInt(45)+1;
							check = false;
					} // end if
				} // end for loop
			} // end for loop
			
		} // end while loop
		
	}
	
	// Returns the random array
	public int[] getArray() {
		return array;
	}
}
