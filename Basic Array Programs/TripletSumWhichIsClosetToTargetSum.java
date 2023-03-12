package com.array.programs;

import java.util.Arrays;

/*
arr = {2, -3, 4, -2}, sum = 1
Soln:
- Sort the array
- Take one loop & iterate each element.
- Now for each element, you check tripletSum = arr[i] + arr[start] + arr[end].
- If difference of tripletSum & targetSum is lesser than existing min difference, then we update the min
  difference & closetSum.
- In case o arr[i] + arr[start] + arr[end] greater than targetSum, decrease the end by 1, If it's less than
  increase the start.
- At last, return closestSum
- Time Complexity --> O(N * N), Space Complexity --> O(1)
 */
public class TripletSumWhichIsClosetToTargetSum {
    public static int tripletSumWithClosestToGivenSum(int[] arr, int sum){
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;
        int closestSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 2; i++){
            int start = i + 1;
            int end = arr.length - 1;

            while(start < end){
                int tripletSum = arr[i] + arr[start] + arr[end];

                if(Math.abs(sum - tripletSum) <= minDifference && tripletSum < closestSum){
                    minDifference = Math.abs(sum - tripletSum);
                    closestSum = tripletSum;
                }
                if(tripletSum == sum){
                    return tripletSum;
                } else if (tripletSum < sum) {
                    start++;
                }else{
                    end--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, -2};
        System.out.println(TripletSumWhichIsClosetToTargetSum.tripletSumWithClosestToGivenSum(arr, 1));
    }
}
