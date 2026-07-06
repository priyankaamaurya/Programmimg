package day10;

public class SlidingWindowMaxSum {

    public static int maxSumSubarray(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];       // add next element
            windowSum -= arr[i - k];   // remove previous element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Max Sum: " + maxSumSubarray(arr, k));
    }
}
