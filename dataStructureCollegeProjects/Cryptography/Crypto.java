import java.util.*;
import java.util.Arrays;
import java.util.Scanner;



public class Crypto {


	
	public static void main(String[] args) {
		
		FileIO reader = new FileIO();
		String[] contents = reader.load("encode.txt");
		String userString ="";// Scan the users string


		for(String i : contents) {
			// System.out.println(i);
			userString += i;
		}
		
		
		int[] intArray = new int[256]; // array to store the int representation of the char
		
		for(int i = 0; i<userString.length(); i++) {
			// transform the char into the binary representation of that char
			String binaryNum = Integer.toBinaryString((int)userString.charAt(i)); 
			// stores the int representation of the char in a array				
			intArray[(int)userString.charAt(i)] += (int)userString.charAt(i); 
		}
		
		List<Integer> frequencies = new ArrayList<Integer>();
		// prints out how many times each character occurs
		for(int i = 0; i<intArray.length; i++) {
			if(intArray[i] != 0 ) {
				if((intArray[i]/i) == 1) {
					System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " time");
				} else {
					System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " times");
				}
				frequencies.add(intArray[i]/i);
			}
		}

		int sizeOfArrayList = frequencies.size();
		int[] array = new int[sizeOfArrayList];
		int k =0;
		int amountOfLetters = 0;
		for(int i : frequencies) {
			amountOfLetters += i;
			array[k] = i;
			k++;
		}

		Arrays.sort(array);

		for(int i : array) {
			double result = 100*(double)i/(double)amountOfLetters;
			System.out.printf("%.2f \n", result);
		}

	}

}
