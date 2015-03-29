package BinarySearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,11,111,1111,1111,11111,111111};
		
		int target = 111;
		int low = 0;
		int high = array.length -1;
		int indexOfNum = -1;
		System.out.println(indexOfNum);  
		
		while(low <= high) {
			
			int mid = (low + high)/2;
			
			if(target == array[mid]) {
				indexOfNum = mid;
				break; 
			} 
			else if(target > array[mid]) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		
		System.out.println(indexOfNum);  
	}
	
}
