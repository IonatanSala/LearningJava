package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Estera");
		
//		for(String i : names) {
//			System.out.println(i);
//		}
		
		// This does the same thing as above
		names.forEach(e -> System.out.println(e));
		
		
	}
}
