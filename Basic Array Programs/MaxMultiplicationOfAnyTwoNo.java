package com.array.programs;
/*
arr = {4, 1, 2, 7, 3}
Soln -1: Using two for loop
- initialize a max variable
- check with every number with other number if multiplication of two number is greater than max.
Time Complexity --> O(N^2) , SC ---> O(1)
**********************************************************************************
Soln -2: Using Sorting (for -ve no. this case is not possible)
- Sort the array
- Now multiply starting two numbers & last two numbers & whichever is maximum, return that number.
Time Complexity --> O(N * logN), SC ---> O(1)(not using any extra space)
***********************************************************************************
Soln - 3: Using one loop
- We initialize smallest, secondSmallest, greatest & secondGreatest.
- Now we iterate on loop & keep on updating above value as per current value.
- Multiple smallest * secondSmallest, greatest * secondGreatest.
- Whichever is maximum, return that.
Time Complexity --> O(N), SC ---> O(1)
 */
public class MaxMultiplicationOfAnyTwoNo {
    public int getMaxMultiplicationOfTwoNumbers(int[] arr){
        if(arr.length < 2){
            return -1;
        }
        if(arr.length == 2){
            return arr[0] * arr[1];
        }
        int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
        int secondSmallest = arr[0] > arr[1] ? arr[0] : arr[1];

        int greatest = arr[0] > arr[1] ? arr[0] : arr[1];
        int secondGreatest = arr[0] < arr[1] ? arr[0] : arr[1];

        for(int i = 2; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
            if(arr[i] > greatest){
                secondGreatest = greatest;
                greatest = arr[i];
            } else if (arr[i] > secondGreatest) {
                secondGreatest = arr[i];
            }
        }
        int firstTwoMultiplication = smallest * secondSmallest;
        int lastTwoMultiplication = greatest * secondGreatest;

        return firstTwoMultiplication > lastTwoMultiplication ? firstTwoMultiplication : lastTwoMultiplication;
    }

    public static void main(String[] args) {
        MaxMultiplicationOfAnyTwoNo m = new MaxMultiplicationOfAnyTwoNo();
        int arr[] = {-4, 2, 3, -10, 4, -15, 3, 6};
        System.out.println(m.getMaxMultiplicationOfTwoNumbers(arr));
    }
}
