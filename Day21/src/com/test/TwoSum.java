package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2,5,4,7,8,6,9};
		int target = 11;
		
		List l= new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int num = target - arr[i];
			
			if(map.containsKey(num)) {
				l.add(map.get(num));
				l.add(i);
				break;
//				System.out.println("TwoSum of elements: " + num + " + " + arr[i]);
//				return;
			}
			map.put(arr[i], i);
		}
		System.out.println(l);
	} 
}
