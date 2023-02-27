package com.array.programs;
/* Time Complexity --> O(N * N) ---> SC --> O(1), This ques. we will sort in ascending order.
Selection sort is a simple and efficient sorting algorithm that works by repeatedly
selecting the smallest (or largest) element from the unsorted portion of the list and
moving it to the sorted portion of the list.

***********************************************************************

Follow the below steps to solve the problem:

1.Initialize minimum value(min_idx) to location 0.
2.Traverse the array to find the minimum element in the array.
3.While traversing if any element smaller than min_idx is found then swap both the values.
4.Then, increment min_idx to point to the next element.
5.Repeat until the array is sorted.

For eg- 5,[ 14, 2, 3, 1](find minimum element from this) swap it with index 0 ---> 1, [14, 2, 3, 5] ---->
 for 1st index find minimum element (2) ---> 1, 2, [14, 3, 5] ---> 1, 2, 3, [14, 5] ---> 1, 2, 3, 5, 14
 */
public class SelectionSort {

    public static void selectionSort(int[] arr){
        if(arr.length <= 1){
            return;
        }
        for(int i = 0 ; i < arr.length-1; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
//                if(arr[minIndex] < arr[j]){  // for descending
                if(arr[minIndex] > arr[j]){   // for ascending
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 14, 2, 3, 1};

        System.out.print("Input: ");
        for(int i = 0 ;i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        SelectionSort.selectionSort(a);
        System.out.println();

        System.out.print("Output: ");
        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
