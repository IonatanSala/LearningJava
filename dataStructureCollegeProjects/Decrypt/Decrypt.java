import java.util.*;

public class Decrypt {

	public static void main(String[] args) {
		long[] publicKey = {24852977, 2744, 8414508};
		long[] cipher = {15268076, 743675};

		long privateKey = findPow(publicKey[1], publicKey[0], publicKey[2]);
		System.out.println("The private key is: " + privateKey);
		long modVal = modPow(cipher[0], publicKey[0] - 1 - privateKey, publicKey[0]);
		long message = modVal * cipher[1] % publicKey[0];

		System.out.println("The secrect message number is " + message);




	}

	public static long findPow(long number, long modulus, long answer) {
		boolean flag = false;
		long result = 0;

		for(int i = 0; i<modulus; i++) {
			if(modPow(number, i, modulus) == answer) {
				result = i;
				flag = true;
				break;
			}
		}

		if(flag == true) {
			return result;
		} else {
			return 0;
		}
	}


	public static long modPow(long number, long power, long modulus) {
		if(power == 0) {
			return 1;
		} else if(power % 2 == 0) {
			long halfpower = modPow(number, power / 2, modulus);
			return modMult(halfpower, halfpower, modulus);
		} else {
			long halfpower = modPow(number, power / 2, modulus);
			long firstbit = modMult(halfpower, halfpower, modulus);
			return modMult(firstbit, number, modulus);
		}
	}

	public static long modMult(long first, long second, long modulus) {
		if(second == 0) {
			return 0;
		} else if(second % 2 == 0) {
			long half = modMult(first, second / 2, modulus);
			return (half + half) % modulus;
		} else {
			long half = modMult(first, second / 2, modulus);
			return (half + half + first) % modulus; 
		}
	}


}