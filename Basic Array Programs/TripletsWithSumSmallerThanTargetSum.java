package com.array.programs;

import java.util.Arrays;

/*
arr = {1, 2, -3, 4, -2} , targetSum = 1, [-3, -2, 4] [-3, -2, 2] [-3, -2, 1] [-3, 1, 2]
Soln:
- Sort the array.
- Take one loop & iterate each element.
- Now for each element, you check if  arr[i] + arr[start] + a[end] less than targetSum, it's true than you
  increase the triplet count by end - start & increase the start.
- In case of arr[i] + arr[start] + arr[end] greater than targetSum, decrease the end by 1.
- At last return tripletCount.
- Time Complexity --> O(N * N), Space Complexity --> O(1)
 */
public class TripletsWithSumSmallerThanTargetSum {
    public static int tripletsWithLessThanGivenSum(int[] arr, int sum){
        Arrays.sort(arr);

        int tripletCount = 0;

        for(int i = 0; i < arr.length - 2; i++){
            int start = i + 1;
            int end = arr.length - 1;

            while(start < end){
                int t = arr[i] + arr[start] + arr[end];
                if(t < sum){
                    tripletCount = tripletCount + end - start;
                    start++;
                }else{
                    end--;
                }
            }
        }
        return tripletCount;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -2};
        System.out.println(TripletsWithSumSmallerThanTargetSum.tripletsWithLessThanGivenSum(arr, 1));
    }
}
