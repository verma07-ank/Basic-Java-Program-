package com.array.programs;

import java.util.HashSet;
import java.util.Set;

/*
arr1 = {4, 2, 3, 5, 4, 2, 3}
arr2 = {9, 1, 7, 2, 4, 2, 1, 2}
Intersection : 2, 4 --> unique element in the answer which are common in both array.
Steps:
- Take a Set and one by one put all values of first array.
- Now, iterate 2nd array & check if it present in 1st array, put this value in another new Set(i.e finalSet)
- At last, all unique common elements will be present in finalSet
- iterate first array1 take the values, now do the same for array 2 and check if it's present in arr1 or not.
- If present then add that element in final list.
- If not present need not to do anything simply move to next index.
- Time Complexity --> O(N + M) for iterating the both array where N -> first array length, M -> second array length.
 */
public class IntersectionOfTwoUnsortedArray {
    public void intersectionOfTwoUnsortedArray(int[] arr1, int[] arr2, Set<Integer> finalIntersection){
        int i = 0;
        int  j = 0;
        Set<Integer> tempSet = new HashSet<>();

        while(i < arr1.length){
            tempSet.add(arr1[i++]);
        }
        while(j < arr2.length){
            if(tempSet.contains(arr2[j])){
                finalIntersection.add(arr2[j]);
            }
            j++;
        }
    }

    public static void main(String[] args) {
        IntersectionOfTwoUnsortedArray i = new IntersectionOfTwoUnsortedArray();

        int[] arr1 = {4, 2, 3, 5, 4, 2, 3};
        int[] arr2 = {9, 1, 7, 2, 4, 2, 1, 2};
        Set<Integer> finalIntersection = new HashSet<>();
        i.intersectionOfTwoUnsortedArray(arr1, arr2, finalIntersection);
        System.out.println(finalIntersection);
    }
}
