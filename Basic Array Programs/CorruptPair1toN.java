package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Corrupt pair in givn no. from 1 to n.
arr = {4, 3, 4, 5, 1} , n = 5 , [Missing, Duplicate] --> (2, 4)
Soln -
- We'll start from 0th index & iterate all elements of all array.
- If we array value is not arr[arr[i] - 1], then we need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- Now once we've sort the values, missing no. will be index + 1 & duplicate value will be value present at this index.
- Time Complexity --> O(N), Space Complexity --> O(1).
 */
public class CorruptPair1toN {
    public static List<Integer> findCorruptPair(int[] arr){
        if(arr.length == 0){
            return new ArrayList<>();
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
            }else{
                i++;
            }
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                return new ArrayList<>(Arrays.asList(i+1, arr[i]));
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 5, 1};
        System.out.println(CorruptPair1toN.findCorruptPair(arr));
    }
}
