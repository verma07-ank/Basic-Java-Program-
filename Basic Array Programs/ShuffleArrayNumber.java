package com.array.programs;

import java.util.Random;

/*
arr = {3, 7, 4, 1, 8, 9, 10} ---> {1, 3, 4, 8, 9, 10}
Soln :
- We iterate the array from 1st value to last value.
- Now using the random class, we create a random value which will give me value between 0 to arr.length.
- Now I swap the current index value to random index value.
- So when I do this for all the number, it shuffle value that it's non deterministic.
- Time Complexity --> O(N), SC ---> O(1)
 */
public class ShuffleArrayNumber {
    public static void shuffleNumbers(int[] arr){
        Random randomObject = new Random();

        for(int i = 0; i < arr.length; i++){
            int randomValue = randomObject.nextInt(arr.length);
            int currentValue = arr[i];
            arr[i] = arr[randomValue];
            arr[randomValue] = currentValue;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {3, 7, 4, 1, 8, 9, 10};

        for(int i = 0; i < 10; i++){
            ShuffleArrayNumber.shuffleNumbers(arr);
        }
    }
}
