package day15;

public class AnagramCheck {

	public static boolean isAnagram(String s, String t) {
		
		// Step 1: Handle null
		if(s == null || t == null) {
			return false;
		}
		
		 // Step 2: Convert to lowercase
		s = s.toLowerCase();
		t = t.toLowerCase();
		
		// Step 3: Length check
		if(s.length() != t.length()) {
			return false;
		}
		
		// Step 4: Create frequency array
		int[] count = new int[26];
		
		// Step 5: Traverse both strings
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		
		// Step 6: Check all values are zero
		for(int num : count) {
			if(num != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "Listen";
		String t = "Silent";
		
		if(isAnagram(s, t)){
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
	
}
