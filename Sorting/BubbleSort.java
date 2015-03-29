package Sorting;


public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("This is the array before it got sorted: ");
		// Prints out the unsorted array
		for(int i : array) System.out.println(i);
			
		
		
		System.out.println("After the array is sorted: ");
		
		boolean check = false;
		
		while(!check) {
			
			check = true;
			
			for(int i =0; i<array.length -1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					check = false;
				}
			}
		}
		
		// prints out the sorted array
		for(int i : array) System.out.println(i);
	}
}
