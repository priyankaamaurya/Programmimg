package com.string;

public class Reverse {

	public static void main(String[] args) {
		
//		String s = "WOW";
		String s = "Hello World";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i-- ) {
			char c=s.charAt(i);
			rev = rev+c;
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
