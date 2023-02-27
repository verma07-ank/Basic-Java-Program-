package com.array.programs;
/*
Find smallest subarray length such that if we sort it, whole array will be sorted.
arr = {1, 2, 5, 3, 0, 12, 13, 8, 15, 18}
Soln:
- We take two variable start = 0 & end = a.length -1
- Now iterate start until you get increasing value && decrease end until you get previous value is lesser than current value.
- Once you get start & end, get max & min between start & end
- Now you keep on going from 'start' to 0th index & check if value is lesser than min then it'll be part of sorting.
- Same way you check 'end' to last index that if value is lesser than max then this will be part of subarray.
- At last, you return end - start - 1
- Time Complexity --> O(N), Space Complexity --> O(1)
 */
public class SmallestSubarrayLengthIfWeSortSubarrayWholeArraySorted {
    public static int getMinSubarrayLengthForSorting(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        while(start < arr.length - 1 && arr[start] < arr[start + 1]){
            start++;
        }
        if(start == arr.length - 1){
            return 0;
        }
        int end = arr.length - 1;
        while(end > 0 && arr[end - 1] < arr[end]){
            end--;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = start + 1; i < end; i++){
            min = Math.min(min, arr[i]);
            max = Math.min(max, arr[i]);
        }
        while(start >= 0 && arr[start] > min){
            start--;
        }
        while (end < arr.length && arr[end] < max){
            end++;
        }
        return end - start - 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 0, 22, 13, 8, 15, 18};
        System.out.println(SmallestSubarrayLengthIfWeSortSubarrayWholeArraySorted.getMinSubarrayLengthForSorting(arr));
    }
}
