package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
arr = {1, 2, -3, 4, -2, -1}, sum = 1, [-1, 4, -1] [1, 2, -2]
Soln:
- Sort the array.
- Take one loop & iterate each element.
- Now for each element, you check if there exists a pair whose sum is equal to targetSum - current value.
- When you find out value, you add in final list, else you increase start or decrease end depending on value addition.
- Time Complexity --> O(N * N) , Space Complexity ---> O(1)
 */
public class AllTripletsForGivnSum {
    public static List<List<Integer>> findTriplets(int[] arr, int targetSum){
        Arrays.sort(arr);

        List<List<Integer>> allTriplets = new ArrayList<>();

        for(int i = 0; i < arr.length - 2; i++){
            int sum = targetSum - arr[i];
            int start = i + 1;
            int end = arr.length - 1;

            while(start < end){
                int t = arr[start] + arr[end];
                if(t == sum){
                    allTriplets.add(Arrays.asList(arr[start], arr[end], arr[i]));
                    start++;
                    end--;
                } else if (t < sum) {
                    start++;

                }else{
                    end--;
                }
            }
        }
        return allTriplets;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -2, -1};
        System.out.println(AllTripletsForGivnSum.findTriplets(arr, 1));
    }
}
