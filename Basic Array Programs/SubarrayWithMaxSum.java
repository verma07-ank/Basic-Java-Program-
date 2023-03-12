package com.array.programs;
/*
We need to find sub array with maximum sum in the givn array, Kadane Algo.
But problem is Kadane algo will not work if all the elements in an array are negative.
for(i = 0 to n) --> sum = sum + a[i] --> if(sum < 0) { sum = 0; continue; } --> if(sum > max_sum){ max_sum = sum; }
we initialize a variable -- boolean isPositiveexits = false; now if there is single +ve then we set it as true, we'll take another
variable max_element = -1 --> it will store the max_element out of the array. After adding these 2 cases kadane algo will work fine.
*********************************************************************************************************
arr = {-3, 2, -7, 6, -2, 4, -8, 5}, max_sum = 8  ---> {6, -2, 4}
Soln 1: When you've all positive numbers.
- We initialize a variable sum = 0 & max_sum = Integer.MIN_VALUE.
- Now we iterate the loop from starting to end & keep on adding the element in sum.
- If sum is less than 0, then we reset the sum to 0.
- If sum is greater than max_sum, then we update the max_sum with sum from the starting.
- At last, you return max_sum.
- Time Complexity --> O(N), SC ---> O(1)
 */
public class SubarrayWithMaxSum {
    public int findLargestSubarraySum(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is Empty");
            return -1;
        }
        boolean ifPositiveExists = false;
        int max_element = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                ifPositiveExists = true;
            }
            max_element = Math.max(arr[i], max_element);
            sum = sum + arr[i];

            if(sum < 0){
                sum = 0;
                continue;
            }
            max_sum = Math.max(max_sum, sum);
        }
        return ifPositiveExists ? max_sum : max_element;
    }

    public static void main(String[] args) {
        SubarrayWithMaxSum s = new SubarrayWithMaxSum();
        int arr[] = {-3, 2, -7, 6, -2, 4, -8, 5};
        System.out.println(s.findLargestSubarraySum(arr));
    }
}
