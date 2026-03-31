package com.string;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeat(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first non-repeating
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '_'; // if no unique character
    }

    public static void main(String[] args) {
        String s = "aabccbd";
        System.out.println(firstNonRepeat(s)); // Output: d
    }
}
