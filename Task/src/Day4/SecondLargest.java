package Day4;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element (all elements may be equal)");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
