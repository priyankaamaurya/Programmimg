package com.sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumUsingHashmap {

	public static void main(String[] args) {
		
		int arr[]= {5,8,3,4,11,6,-3,7,-4};
		int target= -7;
		
		List l = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			int x = target - arr[i];
			if(map.containsKey(x)) {
				l.add(map.get(x));
				l.add(i);
				break; 
			}
			map.put(arr[i], i);
		}
		System.out.println(l);
	}
} 
