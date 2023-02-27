package com.array.programs;
/*
Find missing number in 1 to n+1 numbers range.
arr = {3, 2, 4, 6, 1} , missing no. = 5
Soln :
- We'll start from 0th index & iterate all elements of all array.
- If array value is not index + 1, then wee need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- Now once we've sort the values, missing no will be index + 1, where arr[i] is not equal to i + 1.
- Time Complexity --> O(N), Space Complexity ---> O(1)
 */
public class MissingNoIn1ToNplus1 {
    public static int findMissingNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] <= arr.length && arr[i] != i + 1){
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
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 1};
        System.out.println(MissingNoIn1ToNplus1.findMissingNumber(arr));
    }
}
