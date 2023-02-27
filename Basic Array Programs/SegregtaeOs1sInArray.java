package com.array.programs;
/*
Soln:
- We'll take 2 variable, left & right.
- Left = 0 & right = arr.length - 1.
- Now we'll start from left & keep on increasing left as far as it's '0' value as our target is to place 'O' values at first.
- Similarly, we'll start from right & keep on decreasing right as far as it's '1' value as our target is to place '1' values in second part.
- Now we swap values.
- We do until left is lesser than right.
- Time Complexity --> O(N), Space Complexity --> O(1)
 */
public class SegregtaeOs1sInArray {
    public static void seperate0s1sNumbers(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int left, right;
        left = 0;
        right = arr.length - 1;

        while(left < right){
            while(arr[left] % 2 == 0 && left < right){
                left++;
            }
            while(arr[right] % 2 == 1 && left < right){
                right--;
            }
            if(left < right){
                int x = arr[left];
                arr[left] = arr[right];
                arr[right] = x;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0 , 0, 1, 1, 0, 1};
        SegregtaeOs1sInArray.seperate0s1sNumbers(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
