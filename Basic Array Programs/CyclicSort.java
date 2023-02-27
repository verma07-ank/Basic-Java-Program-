package com.array.programs;
/*
Sort the elements from 1 to n/fixed range.
arr1 = {3, 4, 6, 2, 1, 5} --> {1, 2, 3, 4, 5, 6}
arr2 = {13, 14, 16, 12, 11, 15} -->  {11, 12, 13, 14, 15, 16}
Soln:
- We'll start from 0th index & iterate all elements of array.
- If array value is not index + 1, then we need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- So in one iteration of array, we'll sort the array.
- Time Complexity --> O(N * N), Space Complexity ---> O(1)
 */
public class CyclicSort {
     public static void cyclicSort(int[] arr){
          if(arr.length <= 1){
               return;
          }
          int i = 0;
          while(i < arr.length){
               if(arr[i] - 1 != i){
                    int destinationIndex = arr[i] - 1;
                    int x = arr[i];
                    arr[i] = arr[destinationIndex];
                    arr[destinationIndex] = x;
               }else{
                    i++;
               }
          }
     }

     public static void main(String[] args) {
          int[] arr = {3, 4, 6, 2, 1, 5};
          CyclicSort.cyclicSort(arr);

          for(int i = 0; i < arr.length; i++){
               System.out.print(arr[i] + " ");
          }
     }
}
