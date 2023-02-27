package com.array.programs;
/* Time Complexity - O(N * logN)
QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions
the given array around the picked pivot. There are many different versions of quickSort that
pick pivot in different ways.

Steps of Quick Sort -
1.Always pick the first element as a pivot.
2.Always pick the last element as a pivot (implemented below)
3.Pick a random element as a pivot.
4.Pick median as the pivot.
*******************************************************************************************

Eg - 12, 8, 30, 6, 15, 2, 1, 18 ---> [8, 6, 2, 1], [12], [18, 30, 15] ---> [1, 6, 2], [8],[ 12], [15, 18, 30]
---> [1, 2, 6, 8, 12, 15, 18, 30]

 */
public class QuickSort {

    public static void quicksort(int[] arr, int start, int end){
        int pivot, i, j, temp;

        if(start < end){
            pivot = start;
            i = start;
            j = end;

            while(i < j){
                while(arr[i] <= arr[pivot] && i < end)
                    i++;
                while(arr[j] > arr[pivot])
                    j--;
                if(i < j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            temp = arr[pivot];
            arr[pivot] = arr[j];
            arr[j] = temp;

            quicksort(arr, start, j - 1);
            quicksort(arr, j + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 8, 30, 6, 15, 2, 1, 18};

        System.out.print("Input: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        QuickSort.quicksort(arr, 0, arr.length-1);
        System.out.println();

        System.out.print("Output: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
