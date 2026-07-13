package day14;

public class LargestElements {

	public static int findMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,9,6};
		
		System.out.println(findMax(arr));
	}
}
