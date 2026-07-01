package Day5;

public class SecondSmallest {
	public static int findSecondSmallest(int[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must have atleast 2 elements");
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;			
			}
			else if (num > smallest && num < secondSmallest) {
				secondSmallest = num ;
			}
		}
		
		if (secondSmallest == Integer.MAX_VALUE) {
			throw new RuntimeException("No second smallest element (all elements may be equal)");
		}
		
		return secondSmallest;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 8};
        System.out.println("Second Smallest: " + findSecondSmallest(arr));
	}

}
