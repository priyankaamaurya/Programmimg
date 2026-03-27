package com.string;

public class NumberOfAlphaDigitSpecialChar {

	public static void main(String[] args) {
		
		String s = "Hello@123 World";
		
		int alphabet = 0;
		int digit = 0;
		int specialChar =0;
		
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				alphabet++;
			} else if(ch>='0' && ch<='9') {
				digit++;
			} else {
				specialChar++;
			}
		}
		
		System.out.println("Alphabet : " + alphabet);
		System.out.println("Digit : " + digit);
		System.out.println("Special Character : " + specialChar);

	}
}
