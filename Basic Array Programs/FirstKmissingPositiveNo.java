package com.array.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Soln - 1: Using Sorting
- We sort the array.
- Now start iterating the element : Ignore negative element & as soon as you get positive no., keep monitoring numbers.
- Whenever you find number mismatching, add numbers in missing list.
- Time Complexity --> O(N* Log N), where n is number of values in array. , Space Complexity --> O(N)
Soln - 2:
- We will start from 0th index & iterate all elements of the array.
- If arr value is +ve & less than equal to array length & arr[i] is not [arr[i] - 1], then we need to swap the value, so we get the index value & put this value to it's correct index.
- If it's not the case, then we move to next index.
- Now we traverse array values and if arr value is not equal to index + 1, add index + 1 in missing number list.
- Time Complexity --> O(N), Space Complexity --> O(N)
 */
public class FirstKmissingPositiveNo {
    public static List<Integer> firstKMissingPositiveNumbers(int[] arr, int k){
        if(arr.length == 0 || k < 1){
            return new ArrayList<>();
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]){
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
             }else{
                i++;
            }
        }
        List<Integer> missing = new ArrayList<Integer>();
        Set<Integer> otherNumber = new HashSet<>();

        for(i = 0; i < arr.length & missing.size() < k ; i++){
            if(arr[i] != i + 1){
                missing.add(i + 1);
                otherNumber.add(arr[i]);
            }
        }
        for(int  j = i; missing.size() < k; j++){
            if(!otherNumber.contains(j + 1)){
                missing.add(j + 1);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 11, 1, -3, 2, 8, 4};
        System.out.println(FirstKmissingPositiveNo.firstKMissingPositiveNumbers(arr, 5));
    }
}
