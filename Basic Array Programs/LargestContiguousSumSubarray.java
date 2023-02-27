package com.array.programs;

class ArrayImpl {
    public int largestContiguousSubArrayNegative(int[] a) {
        int max_so_far, current_max;
        max_so_far = current_max = a[0];

        for (int i = 0; i < a.length; i++) {
            current_max = Math.max(a[i], current_max + a[i]);
            max_so_far = Math.max(current_max, max_so_far);
        }
        return max_so_far;
    }
}
public class LargestContiguousSumSubarray {
    public static void main(String[] args) {
        ArrayImpl a = new ArrayImpl();

      int arr[] = {-3, -4, 4, -1, -2, 1, 5, -3};
      System.out.println(a.largestContiguousSubArrayNegative(arr));
    }
}