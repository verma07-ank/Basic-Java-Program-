package com.array.programs;
/*
Remove all duplicates from sorted array.
arr = {1, 4, 4, 4, 5, 6, 7, 7, 8} ---> {[1, 4, 5, 6, 7, 8](unique element), 7, 7, 8} ---> 6 elements are unique.
Soln :
- We will iterate the all element of 1st index.
- We will take 'start' variable , where we'll fill value if it's new element (if a[i] != a[i-1]).
- At last we'll return 'start' as answer as till now we've all unique elements & we've put all unique elements at the start of array.
- Time Complexity --> O(N), Space Complexity ---> O(1).
*/
public class RemoveAllDuplicatesFromSortedArray {
    public static int getUniqueNoLengthWithRemovingDuplicates(int[] arr){
        if(arr.length <= 1){
            return arr.length;
        }
        int start = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[start++] = arr[i];
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 4, 5, 6, 7, 7, 8};
        System.out.println(RemoveAllDuplicatesFromSortedArray.getUniqueNoLengthWithRemovingDuplicates(arr));
    }
}
