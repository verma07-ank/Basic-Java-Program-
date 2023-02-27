package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
arr = {1, 2, -3, 4, -2, -1, 3} , targetSum -> 3 [3, 4, -3, -1] [2, 3, -3, 1] [2, 4, -2, -1]
Soln :
- Sort the array.
- Take two loop & iterate each element.
- Now for each element, you check if there exists a pair whose sum is equal to targetSum - current value.
- When you find out value, you add in final list, else you increase start or decrease end depending on value addition.
- Time Complexity --> O(N * N * N), Space Complexity ---> O(1)
 */
public class AllQuadrupleForGivnSum {
    public static List<List<Integer>> findQuadruple(int[] arr, int targetSum) {
        Arrays.sort(arr);
        List<List<Integer>> allQuadruple = new ArrayList<>();

        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int sum = targetSum - (arr[i] + arr[j]);

                int start = j + 1;
                int end = arr.length - 1;

                while (start < end) {
                    int t = arr[start] + arr[end];
                    if (t == sum) {
                        allQuadruple.add(Arrays.asList(arr[start], arr[end], arr[i], arr[j]));
                        start++;
                        end--;
                    } else if (t < sum) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return allQuadruple;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -2, -1, 3};
        System.out.println(AllQuadrupleForGivnSum.findQuadruple(arr, 3));
    }
}
