package com.array.programs;
/*
Soln :
- We'll take 2 variable, left & right.
- Left = 0 & right = arr.length - 1.
- Now we'll start from left & keep on increasing left as far as it's even value as our target is to place even values at first.
- Similarly, we'll start from right & keep on decreasing right as far as it's odd value as our target is to place odd values in second part.
- Now we swap values.
- Wedo until left is lesser than right.
- Time Complexity --> O(N), where n is elements of array. Space Complexity --> O(1)
 */
public class SegregateOddEvenNoInArray {
    public static void seperateEvenOddNumbers(int[] arr){
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
            while(arr[right] % 2 != 0 && left < right){
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
        int[] arr = {1, 2,4, 3, 5, 7, 8, 6};
        SegregateOddEvenNoInArray.seperateEvenOddNumbers(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
