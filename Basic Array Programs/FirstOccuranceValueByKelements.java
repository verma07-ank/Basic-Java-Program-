package com.array.programs;
/*
Time Complexity ---> O(N)
k = 20, Target = 110 difference of element should be 20.
 */
public class FirstOccuranceValueByKelements {
    public int findWhereAdjacentDifferByAtMostk(int arr[], int k, int val){
        int start = 0;

        while(start < arr.length){
            if(arr[start] == val){
                return start;
            }
            int diff = Math.abs(arr[start] - val) / k;
            diff = Math.max(1, diff);

            start = start + diff;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccuranceValueByKelements f = new FirstOccuranceValueByKelements();

        int[] arr = {70, 60, 70, 80, 90, 110, 130};
        int[] arr1 = {2, 3, 2, 4, 5, 6, 7};

        System.out.println(f.findWhereAdjacentDifferByAtMostk(arr, 20,110));
        System.out.println(f.findWhereAdjacentDifferByAtMostk(arr1, 1, 6));
    }
}
