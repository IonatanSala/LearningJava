package Lab5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	private String wordCheck;
	private Scanner scan;
	private List<String> words = new ArrayList<String>();

	public FileReader(String wordCheck) {
			this.wordCheck = wordCheck;
			
	}
	
	// opens the file
	public void openFile() {
		try {
			
			scan = new Scanner(new File("src/dictionary.txt"));
			
		} catch(Exception e) {
			System.out.println("It didn't get the file");
		}
	}

	// this method reads in every word and checks if the characters in the users string can be used to make words
	public void readFile() {
		
		
		while(scan.hasNext()) {
			
			StringBuilder isItSolution = new StringBuilder(scan.nextLine());
			StringBuilder word = new StringBuilder(isItSolution); // this will be used to 
			
			
			
			for(int i = 0; i<wordCheck.length(); i++) {
				
				for(int j = 0; j<word.length(); j++) {
					
					if(wordCheck.charAt(i) == word.charAt(j)) {

						word.setCharAt(j, '0');
						j = word.length();

					}
						
				}
			}
			
			
			boolean check = true;
			for(int i = 0; i<word.length(); i++) {
				if(word.charAt(i) != '0') {
					check = false;
				}
			}
			
			
			if(check) words.add(isItSolution+"");
//			if(check && isItSolution.length() >= 6) System.out.println(isItSolution);

		}

	}
	
	public void printWords() {
		int count = 0;
		for(String i : words) {
			if(i.length() > count) count = i.length();
				
		}
		
		System.out.println("The longest word that can be formed is one with " + count + " letters:");
		
		for(String i : words) {
			if(i.length() == count) System.out.println(i);
		}
	}
	
	

	public void closeFile() {
		scan.close();
	}

}
