package com.string;

public class PrintUniqueChar {

	public static void main(String[] args) {
		
		String s = "hello world";
		int [] hash = new int[256];
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				hash[c]++;
			}
		}
		for(int i=0; i<hash.length; i++) {
			if (hash[i]==1){
				System.out.println((char)i + "->" + hash[i]);
			}
		}
	}
}
