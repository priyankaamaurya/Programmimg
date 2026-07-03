package Day7;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        // key = number, value = index

		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			
            // check if complement exists
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement), i}; 
			}
			
            // store current element
			map.put(arr[i], i);
		}
		
		// if no solution found
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,0,7,8,4,5,3,0};
		int target = 9;
		
		int[] result = twoSum(arr, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}
