package com.array.programs;
/*
Find 1st missing positive number in given array.
arr = [-2, 11, 1, -3, 2, 10, 4]
Soln - 1: Using Sorting
- We sort the array.
- Now start iterating the element : Ignore negative element & as soon as you get positive number, keep monitoring numbers.
- Return first missing positive value.
- Time Complexity --> O(N * Log N) where n is the number of values in array. , Space Complexity --> O(1).
Soln - 2:
- We'll start from 0th index & iterate all elements of all array.
- If arr value is positive & less than equal to array length & arr[i] is not arr[arr[i] - 1], then we need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- Now we traverse array values and if arr value is not equal to index + 1, return first missing number (index + 1).
- Time Complexity --> O(N), Space Complexity --> O(1)

 */
public class SmallestMissingPositiveNo {
    public static int smallestMissingPositiveNumber(int[] arr){
        if(arr.length == 0){
            return 1;
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]){
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
                return i + 1;
            }
        }
        return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 11, 1, -3, 2, 10, 4};
        System.out.println(SmallestMissingPositiveNo.smallestMissingPositiveNumber(arr));
    }
}
