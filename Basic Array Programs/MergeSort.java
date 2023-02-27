package com.array.programs;
/* Time Complexity --> O(N * log N)
Merge sort is a sorting algorithm that works by dividing an array into smaller subarrays,
sorting each subarray,and then merging the sorted subarrays back together to form the final sorted array.

For eg - 5, 14, 2, 3, 1 (sort in ascending order) --> Merge sort focus on divide and conquer it will divide depending
on the middle ---->  Divide - here we divide the element
                         [5, 14, 2, 3, 1]
                           /          \
                       [5, 14,2]      [3, 1]     ----> compare [5, 14, 2] with [3, 1]
                      /      \
                    [5, 14]   [2]     ----> compare [5, 14] with [2] (less is 2, so I'll  put this in temp array).
                  /   \
               [5]  [14]              ---> compare 5 with 14.

 We hv merged this array in such a way that they're in sorted order. temp array --> 5, 14 --->[2, 5, 14] (replace this with previous array)
 ---> 1, 2, 3, 5, 14 (required output)
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }

    public static void main(String[] args) {
        int a[] = {8, 7, 6, 3, 10};

        System.out.print("Input: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        MergeSort.mergeSort(a, 0, a.length-1);
        System.out.println();

        System.out.print("Output: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}