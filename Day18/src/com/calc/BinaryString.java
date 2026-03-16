package com.calc;

public class BinaryString {

	public static void main(String[] args) {
		
		String result = movesOnes("11000100101000");
		System.out.println(result);
	}
	
	public static String movesOnes(String s) {
		
		int ones = 0;
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') {
				ones++;
			}
		}
		
		int zeroes =s.length() - ones;
		
		String result = " ";
		
		for(int i = 0; i < ones; i++) {
			result += "1";
		}
		
		for(int i = 0; i < zeroes; i++) {
			result += "0";
		}
		
		return result;
	}
}

