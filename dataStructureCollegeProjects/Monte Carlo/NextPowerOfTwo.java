package Lab1;

public class NextPowerOfTwo {
	
	public static void main(String[] args) {
		
		int x = 1023;
		int num = nextPowerOf2(x);
		
		System.out.println(num);
		
	}
	
	public static int nextPowerOf2(int x) {
		
		// let x = 6 	6 = 110
	   x--;		// x = 5 	5 = 101
	   // 0101 | 0010 = 0111
	   x |= x >> 1;  // handle  2 bit numbers
	   // 0111 | 0001 = 0111
	   x |= x >> 2;  // handle  4 bit numbers
	   // 0111 | 0000 = 0111
	   x |= x >> 4;  // handle  8 bit numbers
	   // 0111 | 0000 = 0111
	   x |= x >> 8;  // handle 16 bit numbers
	   // 0111 | 0000 = 0111
	   x |= x >> 16; // handle 32 bit numbers
	   x++; // 111 +1 = 1000 = 8
	
	   return x;
	 }

}
