package day21;

public class Armstrong {
	
	public static boolean isArmstrong(int num) {
		
		//store original number
		int original = num;
		int sum = 0;
		
		// Step 1: Count digits
		int digits = 0;
		int temp = num;
		
		while(temp > 0) {
			temp = temp / 10;
			digits++;
		}
		
		
		// Step 2: Calculate sum of powers
		 temp = num;
		 
		 while(temp > 0) {
			 int digit = temp % 10;              // get last digit
			 sum += Math.pow(digit, digits);
			 temp = temp / 10;                   // remove last digit
		}
		 
		// Step 3: Compare with original
		 return sum == original; 		
	}
	
	public static void main(String[] args) {
		
		int num = 153;
		
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong Number");
		} else {
			System.out.println(num + " is NOT an Armstrong Number");
		}
		
	}

}
