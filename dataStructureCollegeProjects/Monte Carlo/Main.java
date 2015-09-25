package Lab1;

public class Main {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		MonteCarlo[] ticket = new MonteCarlo[1000000];
		
		for(int i = 0; i<ticket.length; i++) {
			ticket[i] = new MonteCarlo();
		}
		
		// Counter for consecutive pairs
		int count = 0;
		
		for(int i = 0; i<ticket.length; i++) {		// 123456
			ticket[i].setArray();
			int[] array = ticket[i].getArray();
			
//			for(int j : array) System.out.print(j + " ");
//			System.out.println("");
			
		
			
			// checks if the current array has consecutive pairs
			for(int j = 0; j<array.length-1; j++) {
				boolean check = false;
					if(array[j] == array[j+1]+1) {
						check = true;	
					}
				if(check) count++;
			}
		}
		
		System.out.println( "Consecutive pairs out of " +ticket.length + " is: " + count);
		
		double nonConsecutive = ticket.length - count;
		double probability = (nonConsecutive/ticket.length) *100.00;
		
		System.out.println("Non-consecutive pairs out of " +ticket.length + " is: " + nonConsecutive);
		System.out.println("The probability that there will not be a consecutive number in the lottery draw is : " + probability +"%");
		
		long end = System.currentTimeMillis();
		
		System.out.println("The time taken to run this program is " + ((end-start)/1000.00) +" seconds");
		
		
		
	}

}
