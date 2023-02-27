package com.array.programs;
/*
arr[] = {3, 2, 5, 4, 1}, Case 1: k = 3, [1st - 3, 2, 5] , [2nd- 2, 5, 4], [3rd - 5, 4, 1] among all max is 2nd so will return that.
Case 2 : K = 2 my subarray is of size 2 then we have [1st- 3, 2], [2nd- 2, 5], [3rd- 5, 4] --> maximum, [4th - 4,1]
Soln :
- We calculate the sum of 1st K element.
- We take another variable as max_sum & initialize it with sum of 1st K element.
- We also take variable 'start', which'll initialize to 0 at the starting.
- Now we start loop from kth index to last & maintain the sum of k window sum = sum + a[i]
- a[start]
- At every iteration, we check if sum is greater than max_sum, update the max_sum.
- Time Complexity --> O(N), Space Complexity ---> O(1)
 */
public class MaxSumOfSubarraySizeK {
    public int findSubarrayOfSizeKWithMaxSum(int[] arr, int k){
    if(arr.length == 0 || k <= 0){
        return -1;
    }
    int sum = 0 , i;
    for(i = 0; i < k; i++){
        sum = sum + arr[i];
    }
    int max_sum = sum;
    int start = 0;

    for(int j = k; j < arr.length; j++){
        sum = sum + arr[j] - arr[start++];
        if(sum > max_sum){
            max_sum = sum;
        }
    }
    return max_sum;
    }

    public static void main(String[] args) {
     MaxSumOfSubarraySizeK m = new MaxSumOfSubarraySizeK();
     int arr[] = {3, 2, 5, 4, 1};
        System.out.println(m.findSubarrayOfSizeKWithMaxSum(arr, 3));
    }
}
