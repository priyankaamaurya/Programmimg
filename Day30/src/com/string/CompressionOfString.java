package com.string;

public class CompressionOfString {
	
	public static void main(String[] args) {
		
		String s = "aabbaccdda";
		int count = 1;
		String com = "";
		
		for(int i=1; i<=s.length(); i++) {
			if (i < s.length() && s.charAt(i) == s.charAt(i-1)) {
				count++;
			}else {
				com = com + s.charAt(i-1) + count;
				count = 1;
			}
		}
		System.out.println(com);
		
	}

}

