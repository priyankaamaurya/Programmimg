package com.string;

public class NonRepeating {
	
	    public static void main(String[] args) {

	        String str = "swiss";
	        int[] freq = new int[26]; // for lowercase letters

	        // Count frequency
	        for (char ch : str.toCharArray()) {
	            freq[ch - 'a']++;
	        }

	        // Find first non-repeating
	        for (char ch : str.toCharArray()) {
	            if (freq[ch - 'a'] == 1) {
	                System.out.println("First non-repeating character: " + ch);
	                return;
	            }
	        }

	        System.out.println("No non-repeating character found");
	    }
	
}
