package com.calc;

public class KaprekarNumber {
	
	public static void main(String[] args) {
		
		boolean result = isKaprekar(9);
		System.out.println(result);
	}

	public static boolean isKaprekar(int num) {
		
		long square = (long) num * num;
		String s = String.valueOf(square);
		
		int d = String.valueOf(num).length();
		
		String right = s.substring(Math.max(0, s.length()-d));
		String left = s.substring(0, Math.max(0, s.length()-d));
		
		long rightPart = right.isEmpty() ? 0 : Long.parseLong(right);
		long leftPart = right.isEmpty() ? 0 : Long.parseLong(left);
		
		return (leftPart + rightPart) == num;

		}
	
}
