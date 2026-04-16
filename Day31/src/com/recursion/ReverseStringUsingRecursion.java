package com.recursion;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		String str = "Prachi";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
}
