package com.string;

import java.util.HashSet;

public class DuplicateChar {
	
	public static void main(String[] args) {

	        String str = "programming";
	        HashSet<Character> set = new HashSet<>();

	        for (char ch : str.toCharArray()) {
	            if (set.contains(ch)) {
	                System.out.println("First duplicate character: " + ch);
	                return;
	            } else {
	                set.add(ch);
	            }
	        }

	        System.out.println("No duplicate character found");
	 }
	
}
