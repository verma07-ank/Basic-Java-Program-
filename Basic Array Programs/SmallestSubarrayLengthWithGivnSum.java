package com.array.programs;

import java.util.HashMap;
import java.util.Map;

/*
arr[] = {3, 2, 5, 5, 3, 2, 10} ---> sum = 10 , Need to find smallest subarray for the givn sum.
here [1st - 3, 2, 5] -> length = 3, [2nd - 5, 5] -> length = 2, [3rd - 10] -> length = 1
****************************************************************************************
Soln 1: When you've all positive numbers.
- We take two variable start & end which're pointing to starting element.
- We take another variable window_sum = 0 & smallestSubArrayLength.
- Now start from 1st element & add into window_sum.
- If window_sum == given_sum, then we've got our subarray, at this moment you check of end-start+1
 is less than smallestSubArrayLength, then you update the smallestSubArrayLength with end-start+1.
- If window_sum is less than given sum then keep on adding element.
- If window_sum is greater than given-sum then we decrease the element from the starting.
- At last you return smallestSubArrayLength.
- Time Complexity --> O(N), SC ---> O(1)
*****************************************************************************************
 Soln 2: For any case.
- We take variable 'end' which're pointing to starting element & smallestSubArrayLength.
- We take another variable total_sum_till_here = 0 & a map where key'll store total_sum_till_here &
 value will be index where this sum is present.
- Now start from 1st element & if total_sum_till_here == given - sum, you've got subarray, you check
 if end - index of that value is less than smallestSubArrayLength, then you update the value of smallestSubArrayLength.
- If total_sum_till_here - given_sum is present in map, it means value exists, so subarray will start from start + 1 to end.
- If total_sum_till_here - given_sum is not present , then you store total_sum_here as map key.
- At last, you update smallestSubArrayLength.
- Time Complexity --> O(N), SC ---> O(N).

 */
public class SmallestSubarrayLengthWithGivnSum {
    public int findSmallestSubarrayForGivnPositiveNumbers(int[] arr, int sum){
    if(arr.length == 0){
        System.out.println("Array is Empty");
        return -1;
    }
    int start, end, window_sum, smallestLength;
    start = end = 0;
    window_sum = 0;
    smallestLength = Integer.MAX_VALUE;

    while(end < arr.length){
        window_sum = window_sum + arr[end];

        if(window_sum == sum){
            System.out.println("Start Index: " + start + " , End Index: " +end);
            smallestLength = Math.min(smallestLength, end - start + 1);
        }

        while(window_sum > sum && start <= end){
            window_sum = window_sum - arr[start++];

            if(window_sum == sum){
                System.out.println("Start Index: " + start + " , End Index: " +end);
                smallestLength = Math.min(smallestLength, end - start + 1);
            }
        }
        end++;
    }
    return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }
    public int findSmallestSubarrayOfForGivnSum(int[] arr, int sum){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return -1;
        }
        int end, totalSumTillNow, smallestLength;
        end = 0;
        totalSumTillNow = 0;
        smallestLength = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        while(end < arr.length){
            totalSumTillNow = totalSumTillNow + arr[end];

            if(totalSumTillNow == sum){
                System.out.println("Start Index: " + 0 + " , End Index: " +end);
                smallestLength = Math.min(smallestLength, end + 1);
            }
            int windowSum = totalSumTillNow - sum;

            if(map.containsKey(windowSum)){
                int start = map.get(windowSum);
                System.out.println("Start Index: " + (start + 1) + " , End Index: " +end);
                smallestLength = Math.min(smallestLength, end - start);
            }
            map.put(totalSumTillNow, end++);
        }
        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }

    public static void main(String[] args) {
        SmallestSubarrayLengthWithGivnSum s = new SmallestSubarrayLengthWithGivnSum();
        int arr[] = {3, 2, 5, 5, 3, 2, 10};
        int sum = 10;
        System.out.println(s.findSmallestSubarrayForGivnPositiveNumbers(arr, sum));
        System.out.println(s.findSmallestSubarrayOfForGivnSum(arr, sum));
    }
}
