package Lab5;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountdownSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of random letters: ");
		String userString = scan.next();
		userString = userString.toLowerCase();
		FileReader dictionary = new FileReader(userString);

		dictionary.openFile();
		dictionary.readFile();
		dictionary.printWords();
		dictionary.closeFile();

	}




}
