package com.array.programs;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

/*     0  1  2  3  4  5
arr = {4, 2, 5, 3, 1, 8}
sum = 9 (start index - 2, 4- last index) ---> (2, 4) --> 5 + 3 + 1 = 9
sum = 10 (1, 3)
sum = 2 ---> (1, 1) , sum = 5 ----> (2, 2)
- There can be a case when you don't have any indexes for eg. sum = 100 then there is no indexex which summ equlas to 100.
sum = 100 ---> return (-1) ---> or we can print there is no such sub array's exits.
*********************************************************************************************
Soln - 1: When you've all positive numbers.
- We take two variable start & end which're pointing to starting element.
- We take another variable window_sum = 0.
- Now start from 1st element & add into window_sum.
- If window_sum == given_sum , then we've got the sub-array.
- If window_sum is less than given_sum then keep on adding element.
- If window_sum is greater than given_sum then we decrease the element from the starting.
- Whenever window_sum == sum, print start & end index.
Time Complexity --> O(N) , SC ---> O(1)
***********************************************************************************************
Soln -2:  For any case
- We take variable end which're pointing to starting element.
- We take another variable total_sum_till_here = 0 & a map where key'll store total_sum_till_here & value will be index where this sum is present.
- Now start from 1st element & if total_sum_till_here == given sum, you've got sub-array, print the start & end index.
- If total_sum_till_here - given_sum is present in map, it means value exists, so subarray will from start+1 to end.
- If total_sum_till_here - given_sum is not present, then store total_sum_till_here as map key.
Time Complexity --> O(N), SC ---> O(N)
 */
public class SubarraySumIsEqualToGivnSum {
    public void findSubArrayPositiveNumbers(int[] arr, int sum) {
        if (arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        int start, end, window_sum;
        start = end = 0;
        window_sum = 0;

        while (end < arr.length) {
            window_sum = window_sum + arr[end];

            if (window_sum == sum) {
                System.out.println("Start Index: " + start + " , End Index: " + end);
                return;
            }

            while (window_sum > sum && start <= end) {
                window_sum = window_sum - arr[start++];

                if (window_sum == sum) {
                    System.out.println("Start Index: " + start + " , End Index: " + end);
                    return;
                }
            }
            end++;
        }
        System.out.println("There is no such sub-array");
    }
    public void findSubArray(int[] arr, int sum) {
    if(arr.length == 0){
        System.out.println("Array is empty");
        return;
    }
    int end, totalSumTillNow;
    end = 0;
    totalSumTillNow = 0;

    Map<Integer, Integer> map = new HashMap<>();
    while(end < arr.length){
        totalSumTillNow = totalSumTillNow + arr[end];
        if(totalSumTillNow == sum){
            System.out.println("Start Index: " + 0 + ", End Index: " +end);
            return;
        }
        int windowSum = totalSumTillNow - sum;
        if(map.containsKey(windowSum)){
            int start = map.get(windowSum);
                System.out.println("Start Index: " + (start + 1) + ", End Index: " +end);
                return;
            }
            map.put(totalSumTillNow, end++);
            }
        }


    public static void main(String[] args) {
        SubarraySumIsEqualToGivnSum s = new SubarraySumIsEqualToGivnSum();
        int arr[] = {4, 2, 5, 3, 1, 8};
        s.findSubArrayPositiveNumbers(arr, 7);
        s.findSubArray(arr, 9);
    }
}