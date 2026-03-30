package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String s="Programming World";
		int max =0;
		String maxword="";
		
		for (int i=0; i<s.length(); i++) {
			Set <Character> set = new HashSet<>();
			String word="";
			
			for(int j=i; j<s.length();j++) {
				char c=s.charAt(j);
				if(set.contains(c)) {
//					System.out.println(word);
					break;
				}
				word = word + c;
				set.add(c);
				
				
			}
			
			if(word.length()>max) {
				max=word.length();
				maxword= word;
			}

			
		}
		System.out.println(max);
		System.out.print(maxword);

	}
}
