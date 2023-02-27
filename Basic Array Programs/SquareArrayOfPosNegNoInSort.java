package com.array.programs;
/*
Square an array of +/- numbers in sorted array.
arr = {-4, -2, -1, 3, 5} --> {16, 4, 1, 9, 25} --> {1, 4, 9, 16, 25} (sorted square array).
Soln 1: When we need to create new array.
- We'll initialize new array of same length.
- Take two variable start = 0 & end = a.length - 1.
- If square of value present at start is greater than square of value present at end, then we fill the value
  at end of new array & decrease the variable by 1 & increase the start.
- If sqaure of value present at start is lesser than square of value present at end, then we fill the value
  at end of new array & decrease rhe variable by 1 & decrease the end.
- At last we'll return new array.
- Time Complexity --> O(N), Space Complexity --> O(N).
********************************************************************************************************
Soln 2: When we need to update in existing array.
- Take two variable start = 0 & end = a.length - 1
- If square of value present at start is greater than square of value present at end then we swap the value
  & fill square of start value at end & decrease the end.
- If square of value present at start is lesser than square of value present at end, then we fill the square
  value at end of new array & decrease the end.
- Time Complexity --> O(N), Space Complexity ---> O(1).
 */
public class SquareArrayOfPosNegNoInSort {
    public static int[] squareInSortedManner(int[] arr){
        int[] squareArr = new int[arr.length];
        int i = arr.length - 1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(arr[start] * arr[start] > arr[end] * arr[end]){
                squareArr[i--] = arr[start] * arr[start];
                start++;
            }else{
                squareArr[i--] = arr[end] * arr[end];
                end--;
            }
        }
        return squareArr;
    }
    public static void squareInSortedMannerExistingArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(arr[start] * arr[start] > arr[end] * arr[end]){
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
            }
            arr[end] = arr[end] * arr[end];
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {-4, -2, -1, 3, 5};

        int[] squareArr = SquareArrayOfPosNegNoInSort.squareInSortedManner(arr);
        for(int i = 0; i < squareArr.length; i++){
            System.out.print(squareArr[i] + " ");
        }
        System.out.println();

        SquareArrayOfPosNegNoInSort.squareInSortedMannerExistingArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
