package com.array.programs;

import java.util.*;

/*
Sort array as per value if frequency is same.
arr = {10, 7, 10, 11, 10, 7, 5, 6} ---> {10, 10, 10, 7, 7, 5, 6, 1}
Soln :
- Iterate all element of array & put in map (key as number & value as frequency).
- Now map has all value with their frequency.
- Now use comparator & compare based on their map value.
- If frequency is same then compare using value of array element.
- Time Complexity --> O(N * log N) , Space Complexity --> O(N)
 */
public class SortArrayBasedOnFreqOfValue {
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
        System.out.println(SortArrayBasedOnFreqOfValue.sortBasedOnFrequencyAndIndex(list));
    }
}
