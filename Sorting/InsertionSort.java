package Sorting;


public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("This is the array before it got sorted: ");
		
		// Prints out the unsorted array
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("After the array is sorted: ");
		
		for(int i =1; i<array.length; i++) {
			int key = array[i];
			int j = i -1;
			
			while(j >= 0 && array[j]>key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		
		// prints out the sorted array
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Your number is at array index: " + binarySearch(array, 35));
	}
	
	public static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length -1;
		
		
		while(low <= high) {
			
	
			int mid = (low + high) / 2;
			
			if(target == array[mid]) return mid;
			
			else if(target > array[mid]) low = mid + 1;
			
			else high = mid -1;
			
		}
		return -1;
	}	
	
}
