package com.array.programs;

import java.util.ArrayList;
import java.util.List;

/*
arr1 = {2, 3, 4, 7, 8};  ---> i variable
arr2 = {1, 2, 4, 6, 7, 8, 10}; ---> j variable
Union : {1, 2, 3, 4, 6, 7, 8, 10} ---> (all the elements from both array) ---> new array ---> [arr1.length + arr2.length]
Steps : Case 1: When both array hv unique element, no duplicates are available.
- One by one we'll compare both array value from starting.
- Whichever array value is smaller put that value in new array or list & increase the index by 1.
- If both array value is same, then put any array value in new array or list & increase both indexs(i, j)
- At last if you've any item left in an array, put all the values of that array in new array.
- Time Complexity ---> O(N+M) for iterating the both array where n - first array length, m - second array length.
 *********************************************************
 Case 2: When we have duplicates elements in an array.
- If duplicates are available then we'll check if i, i+1 are equal if it's so then we'll increase the index by 1.
- If both the values are same increase the index of i, j by 1.
***********************************************************
Case 3: When arr1 and arr2 size is not equal
- I hv done complete iteration of arr1 , nd arr2 is still left now we need to consider duplicates as well.
- Both j and j+1 are same then increase the index by 1.
***********************************************************
********************** We need to handle all the cases. ************************
 */
public class UnionOfTwoSortedArrays {
    public void unionOfTwoSortedArray(int[] arr1, int[] arr2, List<Integer> finalList) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            while ((i < arr1.length - 1) && (arr1[i] == arr1[i + 1])) {  // --> This will handle duplicates
                i++;
            }
            while ((j < arr2.length - 1) && (arr2[j] == arr2[j + 1])) {
                j++;
            }
            if (arr1[i] < arr2[j]) {
                finalList.add(arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                finalList.add(arr2[j++]);
            } else {
                finalList.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            if (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) { // this will handle the last case.
                i++;
            } else {
                finalList.add(arr1[i++]);
            }
        }
        while ((j < arr2.length)) {
            if (j < arr2.length - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            } else {
                finalList.add(arr2[j++]);
            }
        }
    }

    public static void main(String[] args) {
        UnionOfTwoSortedArrays u = new UnionOfTwoSortedArrays();

        int[] arr1 = {2, 4, 4, 5, 6 , 7, 7};
        int[] arr2 = {1, 2, 2, 2, 3, 4, 5, 7};
        List<Integer> finalUnionArray = new ArrayList<>();

        u.unionOfTwoSortedArray(arr1, arr2, finalUnionArray);
        System.out.println(finalUnionArray);
    }
}
