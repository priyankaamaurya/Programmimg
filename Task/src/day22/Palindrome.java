package day22;

public class Palindrome {
	
	public static boolean isPalindrome(int num) {
		
		int original = num;
		int reverse = 0;
		
		while (num > 0) {
			
			int digit = num % 10;                // get last digit
			reverse = reverse * 10 + digit;      // build reverse
			num = num / 10;                      // remove last digit
			
		}
		return original == reverse;
	}

	public static void main(String[] args) {
		
		int num = 121;
		
		if(isPalindrome(num)) {
			System.out.println(num + " is Palindrome");
		} else {
			System.out.println(num + " is not Palindrome");
		}
	}
}
