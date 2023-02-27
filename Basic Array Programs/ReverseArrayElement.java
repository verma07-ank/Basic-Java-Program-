package com.array.programs;

import java.util.Arrays;
import java.util.Collections;

/* Reverse An Array
Soln - 1: Using new array
- We take a new array with size equal to givn array.
- Now start iterating the element & keep on pushing from last in new array.
- Time Complexity --> O(N) , where n is number of values in array. , Space Complexity --> O(n)
Soln - 2: Using Swapping
- We take two variable start = 0 & end = n - 1.
- We swap the element present at start & end , increase the start++ & decrease the end--.
- We do this until start is less than end.
- Time Complexity --> O(N), where n is number of values in array. , Space Complexity --> O(1)
Soln - 3: Using Library Function
- We do Collections.reverse(Arrays.asList(arr))
- So basically we need to convert array to in list form & then reverse it.
- One point to note it take object, so rather than primitive array, take object integer array.
 */
public class ReverseArrayElement {
    // First Method
    private int[] reverseAnArray1(int[] arr, int n){
        if(arr.length <= 1){
            return arr;
        }
        int[] new_array = new int[n];
        int j = n;

        for(int i = 0; i < n; i++){
            new_array[j - i - 1] = arr[i];
        }
        return new_array;
    }
    // Second Method
    private void reverseAnArray2(int arr[], int n){
        if(arr.length <= 1){
            return;
        }
        int t = 0;
        for(int i = 0; i < n / 2; i++){
            t = arr[i];
            arr[i] = arr[n - i -1];
            arr[n - i - 1] = t;
        }
    }
    // Third Method
    private void reverseAnArray3(int arr[], int start, int end){
        if(arr.length <= 1){
            return;
        }
        if(start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseAnArray3(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        ReverseArrayElement reverse = new ReverseArrayElement();
        int arr[] = {1, 2, 3, 4, 5};
        // Method 1
        int[] reversed_array = reverse.reverseAnArray1(arr, arr.length);
        for (int i = 0; i < reversed_array.length; i++){
            System.out.print(reversed_array[i] + " ");
        }
        System.out.println();

        // Method 2
        reverse.reverseAnArray2(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Method 3
        Integer arr2[] = {1, 2, 3, 4 , 5};

        Collections.reverse(Arrays.asList(arr2));
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
