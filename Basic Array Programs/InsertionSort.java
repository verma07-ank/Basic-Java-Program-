package com.array.programs;
/*
Insertion Sort - Time Complexity - O(N*N), SC - O(1) ---> is a simple sorting algorithm that works similar to
the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.

*********************************************************************************************

1.Iterate from arr[1] to arr[N] over the array.
2.Compare the current element (key) to its predecessor.
3.If the key element is smaller than its predecessor, compare it to the elements before.
4.Move the greater elements one position up to make space for the swapped element.

For eg - 5, 2, 14, 6, 3 ---> will compare 2 with 5 --> 2, 5, 14, 6, 3 (14 compare with 5 then check with 2
as well now chck further) now I will compare 6 with 14 --> 2, 5, 6, 14, 3 ---> then compare 14 with 3 -->
 2, 3, 5, 6, 14
 */
public class InsertionSort {
    public static void insertionSort(int[] arr){
        if(arr.length <= 1){
            return;
        }
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 14, 2, 3, 1};
        System.out.print("Input: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        InsertionSort.insertionSort(a);
        System.out.println();

        System.out.print("Output: ");
        for(int i = 0;i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
