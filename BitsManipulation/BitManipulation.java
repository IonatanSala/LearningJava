package BitsManipulation;

public class BitManipulation {

	public static int getBitsToDecimal(String bit) {
		int count = 0;
		
		for(int i = 0; i<bit.length(); i++) {
			if(bit.charAt((bit.length()-1)-i) == '0') {
				count += 0;
			}
			else if(bit.charAt((bit.length()-1)-i) == '1') {
				count += Math.pow(2, i);
			} else {
				return -1;
			}
		}
		
		return count;
	}
	
	public static String getDecimalToBits(int num) {
		int num1 = num;
		int arraySize = 0;
		
		while(num1 > 0) {
			num1 = num1/2;
			arraySize++;
		}
		
		int[] array = new int[arraySize];
		
		for(int i =0; i<array.length; i++) {
			if(num % 2 == 0) {
				array[(array.length-1)-i] = 0;
				num = num/2;
			}
			else if(num % 2 == 1) {
				array[(array.length-1)-i] = 1;
				num = num/2;
			}
		}
		
		String bits ="";
		
		for(int i : array) {
			bits += i + "";
		}
		
		return bits;
	}
	
	public static String getOR(String bit1, String bit2) {
		int stringLength = 0;
		
		if(bit1.length() >= bit2.length()) {
			stringLength = bit1.length();
			
		} 
		else if(bit2.length() > bit1.length()) {
			stringLength = bit2.length();
		}
		
		for(int i = 0; i<stringLength; i++) {
			
		}
		return "";
	}
	
}











