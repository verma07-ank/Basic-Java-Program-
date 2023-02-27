package com.array.programs;
/*
Find duplicate value present from 1 to N number range.
arr = {4, 3, 4, 1, 2} ---> n + 1 numbers, n = 4
Soln :
- We'll start from 0th index & iterate all elements of all array.
- If array value is not arr[arr[i] - 1], then we need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- After placing the values, now duplicate value will be placed at last index of array.
- Time Complexity --> O(N), Space Complexity ---> O(1)
 */
public class DuplicateValuePresent1ton {
    public static int findDuplicateValue(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
            }else{
                i++;
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 1};
        System.out.println(DuplicateValuePresent1ton.findDuplicateValue(arr));
    }
}

