package com.array.programs;
/*
Time Complexity - O(N)
 */
class ArrayImplementation {
    public void sortedArrayWith0s1s2s(int a[]) {
        int low, mid, high;
        low = mid = 0;
        high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    if (a[low] != a[mid]) {
                        int temp = a[low];
                        a[low] = a[mid];
                        a[mid] = temp;
                    }
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (a[mid] != a[high]) {
                        int temp = a[mid];
                        a[mid] = a[high];
                        a[high] = temp;
                    }
                    high--;
            }
        }
    }
    public void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
public class SortArrayWith0s1s2s {
    public static void main(String[] args) {
        ArrayImplementation a = new ArrayImplementation();
        int arr[] = {0,0,1,2,2,1,1,1,0,2};
        a.sortedArrayWith0s1s2s(arr);
        a.printArray(arr);
    }
}
