package day11;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        // Step 1: length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: frequency array
        int[] count = new int[26];

        // Step 3: count characters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: check all zero
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}
