import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Languages {
	// Scanner
	public static Scanner scan;
	// list that will be filled with the frequencies
	public static List<Integer> langPer;

	// main 
	public static void main(String[] args) {

		double smallesPer = 100;
		String country = "";
		
		// The language paths
		String[] langArray = {"danish", "english", "finnish", "french", "german", "icelandic", "polish", "russian", "spanish", "swedish"};
		
		// Sorts my encoded percentage array by decending order
		double[] encodeArray = encodeGetFreq();
		for(int x = 0; x<encodeArray.length/2; x++) {
			double temp = encodeArray[x];
			encodeArray[x] = encodeArray[(encodeArray.length-1)-x];
			encodeArray[(encodeArray.length-1)-x] = temp;
		}

		// Goes through all the languages
		for(int x = 0; x<10; x++) {

			double counter = 0;
			double[] languageArray = getFreq(langArray[x]); 
			System.out.println(langArray[x]);
			
			for(int i = 0; i<20; i++) {
				//counter += (encodeArray[i+1] - languageArray[i] >= 0) ? encodeArray[i] - languageArray[i] : (-1)*(encodeArray[i] - languageArray[i]);
				counter = encodeArray[i] - languageArray[i];
				if(counter < 0) counter *= -1;
			}

			System.out.printf(" %.2f \n", counter);

			if(counter < smallesPer) {
				smallesPer = counter;
				country = langArray[x];
			}
			
		} // end if loop

		System.out.println("The language this text is written is in " + country + 
			 " because the smallest percentage difference between the encoded text and the languages is " + smallesPer +  " %");
	} // end main



	// This gets the letter frequency of a language
	public static double[] getFreq(String lang) {

		langPer = new ArrayList<Integer>();
		try {
			
			scan = new Scanner(new File("languages/"+lang+"_monograms.txt"));
			
		} catch(Exception e) {
			System.out.println("It didn't get the file");
		}

		
		int count = 0;
		int i = 1;
		while(scan.hasNext()) {
			
			if(i % 2 == 0) {
				int test = scan.nextInt();
				count += test;
				langPer.add(test);
				i++;
			} else {
				String test = scan.next();
				i++;
			}
		} 
		// System.out.println("This is the " +lang+" language");
		double[] getTop = new double[20];
		int p = 0;
		for(int j : langPer) {
			double result = 100*(double)(j/(double)count);
			if(p<20) {
				getTop[p] = result;
				p++;
			}
			// System.out.printf("%.2f what is this \n", result );
		}
		return getTop;
	} // end getFreq()




	public static double[] encodeGetFreq() {

		FileIO reader = new FileIO();
		String[] contents = reader.load("encode.txt");
		String userString ="";// Scan the users string

		for(String i : contents) {
			// System.out.println(i);
			userString += i;
		}
		
		
		int[] intArray = new int[256]; // array to store the int representation of the char
		
		for(int i = 0; i<userString.length(); i++) {
			// stores the int representation of the char in a array				
			intArray[(int)userString.charAt(i)] += (int)userString.charAt(i); 
		}
		
		List<Integer> frequencies = new ArrayList<Integer>();
		// prints out how many times each character occurs
		for(int i = 0; i<intArray.length; i++) {
			if(intArray[i] != 0 ) {
				if((intArray[i]/i) == 1) {
					// System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " time");
				} else {
					// System.out.println("'" + (char)i + "' appeared " + (intArray[i]/i) + " times");
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
		int takeOutSpace = array[array.length-1];
	
		array[array.length-1] = 0;
		Arrays.sort(array);
		double[] doubleArray = new double[sizeOfArrayList];
		int p = 0;
		for(int i : array) {
			

			
				double result = 100*(double)i/(double)(amountOfLetters-takeOutSpace);
				// System.out.println(result + " result");
				doubleArray[p] = result;
				p++;
			
			
		}

		return doubleArray;

	}


} // end Languages class












