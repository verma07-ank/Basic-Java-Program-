package com.array.programs;

import java.util.ArrayList;
import java.util.List;

/*
Find all missing & duplicate values from 1 to n range.
arr = {2, 6, 4, 4, 3, 2} ---> n  = 6,  missing --> 1, 5 --> duplicates --> 2, 4
Soln:
- We'll start from oth index & iterate all elements of array.
- If array value is not arr[arr[i] - 1], then we need to swap the value, So we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- Now we traverse array values and if arr value is not equal to index + 1, missing no will be index + 1 & duplicate value will be the value present at this index.
- Time Complexity --> O(N), Space Complexity ---> O(1)
*/
public class FindAllMissingDuplicateValues1toN {
    public static List<List<Integer>> findAllMissingAndDuplicateValues(int[] arr){
        if(arr.length == 0){
            return new ArrayList<>();
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
            }else{
                i++;
            }
        }
        List<Integer> missingValues = new ArrayList<>();
        List<Integer> duplicateValues = new ArrayList<>();

        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                missingValues.add(i + 1);
                duplicateValues.add(arr[i]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(missingValues);
        result.add(duplicateValues);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 4, 3, 2};
        System.out.println(FindAllMissingDuplicateValues1toN.findAllMissingAndDuplicateValues(arr));
    }
}
