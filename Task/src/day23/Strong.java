package day23;

public class Strong {
	
	public static int factorial(int n) {
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static boolean isStrong(int num) {
		
		int original = num;
		int sum = 0;
		
		while (num>0) {
			
			int digit = num % 10;
			sum += factorial(digit);
			num = num / 10;
		}
		
		return sum == original;
	}
	
	public static void main(String[] args) {
		
		int num = 145;
		
		if(isStrong(num)) {
			System.out.println(num + " is Strong number");
		} else {
			System.out.println(num + " is NOT Strong number");
		}
	}

}
