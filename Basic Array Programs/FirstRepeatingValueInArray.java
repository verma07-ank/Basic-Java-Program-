package com.array.programs;

import java.util.HashSet;
import java.util.Set;

/* Time Complexity ---> O(N) ---> For iterating thr complete array.
Space Complexity ---> O(N) for Set.
- Take a Set & firstRepeat Variable
- Keep iterating from last index
- If Value present in Set, update firstRepeat
- Else put in Set
- At last, firstRepeat will contain the first repeating value.
 */
public class FirstRepeatingValueInArray {
    public int firstRepeatingValueInArray(int[] arr){
        Set<Integer> s = new HashSet<>();

        int firstRepeating = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            if(s.contains(arr[i])){
                firstRepeating = arr[i];
            }else{
                s.add(arr[i]);
            }
        }
        return firstRepeating;
    }

    public static void main(String[] args) {
        FirstRepeatingValueInArray f = new FirstRepeatingValueInArray();
        int[] arr = {2, 3, 4, 4, 3, 5, 7};
        System.out.println(f.firstRepeatingValueInArray(arr));
    }
}
