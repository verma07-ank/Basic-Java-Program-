package com.array.programs;

/* Brute-force Approach --> O(N) (Time Complexity)
/In worst case we have to go upto n element so there is a better way than this is binary search
 if there is sorted array becz in that we'll get O(logN) --> Time Complexity.
*/
public class SearchingAnElement {
    public static void main(String[] args) {
        int a[] = {12, 34, 45, 67, 13};
        SearchingAnElement obj = new SearchingAnElement();
        int i = obj.searchIndex(a, 34);
        if(i == -1){
            System.out.println("Value doesn't exits in array");
        }else{
            System.out.println(i);
        }
    }
    public int searchIndex(int a[], int val){
        if(a.length == 0){
            return -1;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] == val){
                return i;
            }
        }
        return -1;
    }
}
