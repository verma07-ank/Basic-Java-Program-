package com.array.programs;
/*
Time Complexity ---> for sorted ---> O(log N)
for unsorted ----> O(N)
 */
class ArraySortedUnsorted {
    public int searchValueInUnsortedArray(int[] arr, int val) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchSortedArray(int[] arr, int start, int end, int val) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (val > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
public class SearchValueInSortedNdUnsorted {
    public static void main(String[] args) {
    ArraySortedUnsorted a = new ArraySortedUnsorted();

    int[] arr = {5, 90, 3, 6, 1};
    int index = a.searchValueInUnsortedArray(arr, 3);
    System.out.println(index);

    int[] sortedArray = {1, 3, 7, 10, 45};
    int index1 = a.binarySearchSortedArray(sortedArray, 0, sortedArray.length - 1, 45);
    System.out.println(index1);
    }
}
