package com.array.programs;
/* Time Complexity --> O(N)
Here, the difference is 1 , it can be decreasing or increasing can be in any order but the adjacent element are
differ by 1. For eg - [7, 6, 7, 6, 5, 4] ---> if 5 then we will index of 5, if 6 then return first occurance of 6.
 */
public class FirstOccuranceValue {
    public int findFirstOcuuranceIfAdjacentValueDifferBy1(int arr[], int val){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        while(start < arr.length){
            if(arr[start] == val){
                return start;
            }
            int diff = Math.abs(arr[start] - val);
            start = start + diff;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccuranceValue f = new FirstOccuranceValue();
        int[] arr = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        int[] arr1 = {2, 3, 2, 4, 5, 6, 7};
        System.out.println(f.findFirstOcuuranceIfAdjacentValueDifferBy1(arr, 2));
        System.out.println(f.findFirstOcuuranceIfAdjacentValueDifferBy1(arr1, 6));
    }
}
