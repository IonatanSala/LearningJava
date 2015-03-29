package BitsManipulation;

public class MainClass extends BitManipulation {
	
	public static void main(String[] args) {
		
		int num = 48584;
		String numString = getDecimalToBits(num);
		System.out.println(numString);
		
		int number = getBitsToDecimal(numString);
		System.out.println(number);
	}
}
