package Day7;

public class BruteForce {

	public static int[] twoSum(int[] arr, int target) {
		
        // check all possible pairs
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		
		// if no pair found
        throw new IllegalArgumentException("No two sum solution");

	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,6,5,8,1,4};
		int target = 9;
		
		int[] result = twoSum(arr, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}
