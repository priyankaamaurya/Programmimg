package day8;

public class KadaneAlgorithm {

	public static int maxSubArray(int[] arr) {
		
		int maxSum = arr[0];       //final answer 
		int currentSum = 0;        //running sum
		
		for(int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			
			//update max
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			
			//reset if negative
			if(currentSum < 0) {
			   currentSum = 0; 
			}
		}
		
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
	}
	
}
