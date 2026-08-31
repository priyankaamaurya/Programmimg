package day24;

public class Prime {

	public static boolean isPrime(int num) {
		
		 // Step 1: Handle edge cases
		if (num <= 1) {
            return false;
        }
		
        // Step 2: Check divisibility
		for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false; // not prime
            }
        }
		
		return true; // prime
	}
	
	public static void main(String[] args) {
		
		int num = 7;
		
		if (isPrime(num)) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is NOT Prime Number");
		}
	}
}
