package day17;

public class MedianSortedArray {
	public static double findMedian(int[] nums1, int[] nums2) {
		
		int n1 = nums1.length;
		int n2 = nums2.length;
		
		int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Remaining elements
        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        int total = n1 + n2;

        // Find median
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
        
    }

    public static void main(String[] args) {
    	
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4};

        System.out.println(findMedian(nums1, nums2));
    }

}
