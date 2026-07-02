package Day6;

public class MoveZeros {

	public static void moveZeroesToEnd(int[] arr) {
		
		if(arr == null || arr.length == 0) return ;
		
		int j = 0; // position for next non-zero element
		
        // Step 1: Move all non-zero elements forward
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		
        // Step 2: Fill remaining positions with 0
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0,3,0,6,0,4,8,0,12};
		
		moveZeroesToEnd(arr);
		
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}
