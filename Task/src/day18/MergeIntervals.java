package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	
	public static int[][] merge(int[][] intervals){
		
		// Step 1: Sort intervals based on starting time
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		
	    // Step 2: Create list to store result
		List<int[]> result = new ArrayList<>();
		
		// Step 3: Add first interval
		result.add(intervals[0]);
		
		// Step 4: Traverse remaining intervals
		for(int i = 1; i < intervals.length; i++) {
			
			int[] last = result.get(result.size() - 1);          // last merged interval
			int[] current = intervals[i];                        // current interval
			
			// Step 5: Check overlap
			if(current[0] <= last[1]) {
				// Merge intervals
				last[1] = Math.max(last[1], current[1]);				
			} else {
				// No overlap → add new interval
				result.add(current);
			}	
		}
		
		// Step 6: Convert list to array
		return result.toArray(new int[result.size()][]);
		
	}
	
	public static void main(String[] args) {
		
		int[][] intervals = {
				{1,3}, {2,6}, {8,10}, {14,18}, {12,16}
		};
		 
		int[][] result = merge(intervals);
		
		// Print result
		for (int[] interval : result) {
			System.out.println(interval[0] + " " + interval[1]);
		}
		
	}
	
}
