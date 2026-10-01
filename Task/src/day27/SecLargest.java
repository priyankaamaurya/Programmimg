package day27;

public class SecLargest {
	
	public static int secLar(int arr[]) {
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
	
			for(int num : arr) {
				if(num > first) {
					second = first;
					first = num;
				} else if (num > second && num != first) {
					second = num;
				}
			}
			
			return second;		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,8,17,6,9,14,3,11};
		System.out.println("Second Largest number: " + secLar(arr));
		
	}

}
