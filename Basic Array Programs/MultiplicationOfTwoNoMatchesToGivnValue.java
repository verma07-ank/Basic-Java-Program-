package com.array.programs;

import java.util.HashSet;

/*
arr[] = {4, 1, 3, 10, 7, 5, 8}
val = 15 ----> [3, 5] ----> 3 * 5 = 15
Soln - 1: Using two for loop
- Check with every number with other number if multiplication of two number matches to given value.
Time Complexity ---> O(N^2) , Space Complexity ---> O(1)
****************************************************************************************
Soln - 2: Using Sorting (If you hv only +ve integer then you will apply this, incase of -ve no. you cannot apply sorting)
- Sort the array.
- Now take two pinter from start & end.
- If multiplication of start & end index value is greater than given value decrease the end index by 1.
- If multiplication  of start & end index value is less than given value increase the start index by 1.
- If multiplication of start & end index value is equal to given value return true.
Time Complexity --> O(N * log N) , Space Complexity ---> O(1)
******************************************************************************************
Soln - 3: Using HashSet
- We initialize hashset.
- Traverse array & if val/ a[i] doesn't exits in hashset, insert a[i] value in hashset.
- if val/a[i] exits in hashset then there exits a pair.
Time Complexity --> O(N) , Space Complexity ---> O(N)
*/
public class MultiplicationOfTwoNoMatchesToGivnValue {
    public boolean checkIfProductOfPairMatchesValue(int[] arr, int val) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (val % arr[i] == 0 && s.contains(val / arr[i])) {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        MultiplicationOfTwoNoMatchesToGivnValue m = new MultiplicationOfTwoNoMatchesToGivnValue();
        int arr[] = {4, 2, 3, 10, 4, 15, 3, 1};
        System.out.println(m.checkIfProductOfPairMatchesValue(arr, 15));
    }
}