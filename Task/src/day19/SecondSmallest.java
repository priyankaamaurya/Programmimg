package day19;

public class SecondSmallest {
	
	public static int findSecondSmallest(int [] arr) {
		
		if(arr.length < 2) {
			return -1;
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} 
			else if ( arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}			
		}
		
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,3,6,-3};
		
		System.out.println("Second smallest element is: " + findSecondSmallest(arr));
	}

}
