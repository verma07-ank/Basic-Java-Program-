package com.array.programs;

import java.util.HashSet;
import java.util.Set;

/*
arr1 = {4, 2, 3, 5, 4, 2, 3}
arr2 = {9, 1, 7, 2, 4, 2, 1, 2}
Union : {4, 2, 3, 5, 9, 1, 7}
- Take a set & one by one put all values of first array & second array into it.
- Set only contains the unique elements so it'll have the union of two arrays.
- Time Complexity - O(N + M) , SC - O(N + M) for iterating the both array where N - first array length, M - second array length.
- Best sorting technique either merge sort or quick sort in both case you'll have time complexity of O(N * log N)
*/
public class UnionOfTwoUnsortedArray {
    public void unionOfTwoUnsortedArray(int[] arr1, int[] arr2, Set<Integer> finalList){
        int i = 0;
        int j = 0;

        while(i < arr1.length){
            finalList.add(arr1[i++]);  // add all element in list.
        }
        while(j < arr2.length){
            finalList.add(arr2[j++]);
        }
    }

    public static void main(String[] args) {
        UnionOfTwoUnsortedArray u = new UnionOfTwoUnsortedArray();

        int[] arr1 = {4, 2, 3, 5, 4, 2, 3};
        int[] arr2 = {9, 1, 7, 2, 4, 2, 1, 2};
        Set<Integer> finalUnion = new HashSet<>();
        u.unionOfTwoUnsortedArray(arr1, arr2, finalUnion);
        System.out.println(finalUnion);
    }
}
