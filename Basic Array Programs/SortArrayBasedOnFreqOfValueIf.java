package com.array.programs;

import java.util.*;

/*
Sort the array based on frequency of values (If frequency is same then sort based on occurence)
arr = {10, 7, 10, 11, 10, 7, 5, 6} --> {10, 10, 10, 7, 7, 11, 5, 6}
Soln :
- Iterate all element of array & put in map ( key as number & value as frequency).
- Now map has all value with their frequency.
- Now use comparator and compare based on their map value.
- If frequency is same then compare using index value of array element.
- Time Complexity --> 0(N * Log N) , SC ---> O(N)
 */
public class SortArrayBasedOnFreqOfValueIf {
    public static List<Integer> sortBasedOnFrequencyAndIndex(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        Collections.sort(list, (k1, k2) -> {
            int freq1 = map.get(k1);
            int freq2 = map.get(k2);

            if(freq1 != freq2){
                return freq2 - freq1;
            }
            return list.indexOf(k1) - list.indexOf(k2);
        });
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 7, 10, 11, 10, 7, 6, 5};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(SortArrayBasedOnFreqOfValueIf.sortBasedOnFrequencyAndIndex(list));
    }
}
