package day19;

public class SecondLargest {

	public static int findSecLargest(int[] arr) {
		
		if (arr.length < 2) {
			return -1;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, -5, -2, -8};
		
		System.out.println("Second Largest is :" + findSecLargest(arr));
	}
}
