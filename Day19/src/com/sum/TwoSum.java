package com.sum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = {2,4,6,7,9,4,8};
        int target = 10;

        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    l.add(i);
                    l.add(j);
                    break;
                }
            }
            if(!l.isEmpty()) {
                break;
            }
        }

        System.out.println(l);
    }
}