package com.array.programs;
/*
Longest Subarray with all 1s if at max 'k' 0s can be replaced with 1s.
arr = [0, 1, 0, 1, 0, 1, 1, 1, 0] , k = 2 (I can replace 2 zero's with 1)
Soln :
- We iterate each no. & if value is 0, we increase numberOfZero variable by 1.
- If numberOfZero is greater than k, it means we need to reduce window & remove start item.
- If value at start index is 0, then we decrease numberOfZero-- & increase the start++.
- At every moment we're calculating maxLength = end - start + 1.
- At last, we return maxLength as answer.
- Time Complexity --> O(N) , where n is number of values in array. , Space Complexity --> O(1)
 */
public class LongestSubarrayWithAll1s {
    public static int LongestSubarrayLengthWithAll1sWithKAllowedToReplace(int[] arr, int k){
        if(arr == null || arr.length == 0 || k <= 0 || k > arr.length){
            return -1;
        }
        int maxLength = 0;
        int start, end;
        start = end = 0;
        int numberOfZero = 0;

        while (end < arr.length){
            if(arr[end] == 0){
                numberOfZero++;
            }
            if(numberOfZero > k){
                if(arr[start] == 0){
                    numberOfZero--;
                }
                start++;
            }
            maxLength = Math.max(end - start + 1, maxLength);
            end++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 1, 0};
        int k = 2;
        System.out.println(LongestSubarrayWithAll1s.LongestSubarrayLengthWithAll1sWithKAllowedToReplace(arr, k));
    }
}
