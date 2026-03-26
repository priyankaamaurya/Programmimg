package com.string;

public class Anagram {

	public static void main(String[] args) {
		
		String s1= "listen";
		String s2= "silent";
		
		if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        
        char[] arr = new char[s2.length()];
        
        // copy s2 into array manually
        for(int i = 0; i < s2.length(); i++) {
            arr[i] = s2.charAt(i);
        }
        
        // check each character of s1
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            boolean found = false;
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == ch) {
                    arr[j] = '*'; // mark as used
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                System.out.println("Not Anagram");
                return;
            }
        }
        
        System.out.println("Anagram");	}
}
