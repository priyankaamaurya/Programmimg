package com.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {

	public static void main(String[] args) {
		
		String s = "World";	
			
		for(int i=0; i<s.length();i++) {
			String word="";	
			Set<Character> set = new HashSet<>();
			for(int j=i; j<s.length();j++) {
				if(set.contains(s.charAt(j))) {
					break;
				}
				set.add(s.charAt(j));
				
				word= word+s.charAt(j);
			}
			System.out.println(set);
		}
//		System.out.println(count);
	}
}
