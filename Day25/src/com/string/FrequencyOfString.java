package com.string;

import java.util.HashMap;

public class FrequencyOfString {

	public static void main(String[] args) {
		
		String s = "hello world";
		
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(hash.containsKey(c)) {
				int x = hash.get(c)+1;
				hash.put(c, x);
			}else {
				hash.put(c, 1);
			}
		}
		System.out.println(hash);
	}
}
