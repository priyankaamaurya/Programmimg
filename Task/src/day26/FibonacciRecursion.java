package day26;

public class FibonacciRecursion {

	public static int fib (int n) {
		
		// Step 1: Base case
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		// Step 2: Recursive call
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(fib(i) + " ");
			
		}
	}
}
