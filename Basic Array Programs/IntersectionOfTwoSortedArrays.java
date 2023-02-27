package com.array.programs;

import java.util.ArrayList;
import java.util.List;

/*
Steps:
arr1 = {2, 2 ,2, 3, 3, 4, 7 , 8}
arr2 = {1, 2, 4, 4, 6, 6, 7, 8 , 10}
Intersection : {2, 4, 7, 8 } ---> only common values from both array.
- One by on we'll compare both array values from starting.
- If both array value is same, then put any array value in new array or list & increase both indexes(i, j)
- j < i, whichever value is lesser then I'll increase the index of that value by 1.
- Here, arr1 having 8 element, arr2 --> 10, final array --> 4 so we need to handle this as well, rather than creating array we can take arraylist.
(Arraylist will automatically handle this).
***********************************************************************
- We need to handle duplicates as well.
-
Time Complexity ---> O(N+M) for iterating the both array where N --> first array length, M ---> second array length.
 */
public class IntersectionOfTwoSortedArrays {
    public void intersectionOfTwoSortedArray(int[] arr1, int[] arr2, List<Integer> finalList){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            while((i < arr1.length - 1) && (arr1[i] == arr1[i+1])) {
                i++;
            }
            while((j < arr2.length) && (arr2[j] == arr2[j+1])){
                j++;
            }
            if(arr1[i] < arr2[j]){
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }else{
                finalList.add(arr1[i]);
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        IntersectionOfTwoSortedArrays i = new IntersectionOfTwoSortedArrays();

        int[] arr1 = {2, 2, 2, 3, 3 ,4, 7 , 8};
        int[] arr2 = {1, 2, 4, 4, 6, 6, 7, 8 , 10};
        List<Integer> finalIntersectionArray = new ArrayList<>();

        i.intersectionOfTwoSortedArray(arr1, arr2, finalIntersectionArray);
        System.out.println(finalIntersectionArray);
    }
}
