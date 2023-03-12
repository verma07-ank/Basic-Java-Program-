package com.array.programs;
/*
- We take variable multiplication  = 1 & start = 0.
- Now with i = 0, we start iteration.
- We do multiplication  = multiplication * arr[i] , if this is greater than givn no, we divide multiplication / arr[start] & increase the start.
- Now add all values from current value to start in sub-array.
- Time Complexity --> O(N * N), Space Complexity ---> O(N)
 */
import java.util.ArrayList;
import java.util.List;

public class SubarrayWithMultiplicationOfElementsLessThanGivnNo {
    public static List<List<Integer>> subArrayWithProductMultiplicationLessThanGivnNo(int[] arr, int val){
        int multiplicationOfElements = 1;
        int start = 0;
        List<List<Integer>> solution = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            multiplicationOfElements = multiplicationOfElements * arr[i];

            while(multiplicationOfElements >= val){
                multiplicationOfElements = multiplicationOfElements / arr[start];
                start++;
            }

            List<Integer> list = new ArrayList<>();

            for(int j = 1; j >= start; j--){
                list.add(0, arr[j]);

                solution.add(new ArrayList<>(list));
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 3, 6};
        System.out.println(SubarrayWithMultiplicationOfElementsLessThanGivnNo.subArrayWithProductMultiplicationLessThanGivnNo(arr, 10));
    }
}
