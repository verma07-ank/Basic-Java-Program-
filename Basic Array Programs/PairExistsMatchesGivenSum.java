package com.array.programs;
/*
BruteForce ---> Time Complexity ---> O(N * N)
Sorting ---> Time Complexity ---> O( N * LOG N) , No space complexity then go for Sorting.
Hashing ---> Time Complexity ---> O(N) , Space Complexity in hashing, if it's okay to have space complexity go for hashing.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class ArraysPairMatchesSum{
    public boolean ifPairExistsWithGivenSumBruteForce(int[] arr, int sum){
        if(arr.length == 0){
            return false;
        }
        
        for(int i = 0;i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ifPairExistsWithGivenSumSorting(int[] arr, int sum){
        if(arr.length == 0){
            return false;
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int s = arr[start] + arr[end];

            if(s == sum){
                return true;
            } else if (s > sum) {
                end--;
            }else{
                start++;
            }
        }
        return false;
    }

    public boolean ifPairExistsWithGivenSumHashing(int[] arr, int sum){
        if(arr.length == 0){
            return false;
        }
        Set<Integer> s = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            if(s.contains(sum - arr[i])){
                return true;
            }else{
                s.add(arr[i]);
            }
        }
        return false;
    }
}
public class PairExistsMatchesGivenSum {
    public static void main(String[] args) {

        ArraysPairMatchesSum a = new ArraysPairMatchesSum();

        int[] arr = {12, 3, 5, 1, 9};
        System.out.println(a.ifPairExistsWithGivenSumBruteForce(arr, 10));
        System.out.println(a.ifPairExistsWithGivenSumSorting(arr, 10));
        System.out.println(a.ifPairExistsWithGivenSumHashing(arr, 10));
    }
}
