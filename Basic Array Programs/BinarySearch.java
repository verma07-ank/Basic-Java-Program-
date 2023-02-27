package com.array.programs;
/* Binary Search algorithim ---> TC --> O(log N)
    Condition - Array should be sorted then only we can apply this algorithm.
    Description - Binary Search is a searching algorithm used in a sorted array by repeatedly dividing
    the search interval in half. The idea of binary search is to use the information that the array is
    sorted and reduce the time complexity to O(Log n).
     Binary Search Algorithm can be implemented in the following two ways
        1.Iterative Method
        2.Recursive Method
*******************************************************************************
 We basically ignore half of the elements just after one comparison.
    1.Compare x with the middle element.
    2.If x matches with the middle element, we return the mid index.
    3.Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
    4.Else (x is smaller) recur for the left half.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {12, 34, 45, 65, 83};
        BinarySearch obj = new BinarySearch();
        int i = obj.searchIndex(a, 83, 0, a.length-1);
        if(i == -1){
            System.out.println("Value doesn't exits in array");
        }else{
            System.out.println(i);
        }
    }
    public int searchIndex(int a[], int val, int start, int end){
        if(a.length == 0 || start > end){
            return -1;
        }
        int mid = (start + end) / 2;

        if(val == a[mid]){
            return mid;
        }
        if(val < a[mid]){
            return searchIndex(a, val, start, mid-1); // ----> For left
        }else{
            return searchIndex(a, val, mid+1, end); // ----> For right
        }
    }
}
