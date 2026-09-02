package day25;

public class Fibonacci {

	public static void printFibonacci(int n) {
		
		int a = 0;
		int b = 1;
		
		// Step 1: Print first two numbers
		System.out.print(a + " " + b + " ");
		
		// Step 2: Generate remaining numbers
		 for (int i = 2; i < n; i++) {
			 
			 int next = a + b; // sum of previous two
	         System.out.print(next + " ");
	         
	         // Step 3: Update values
	         a = b;
	         b = next;
	         
		 }
		
	}
	
	public static void main(String[] args) {

		 int n = 7; // number of terms
		 
		 printFibonacci(n);
	}

}
