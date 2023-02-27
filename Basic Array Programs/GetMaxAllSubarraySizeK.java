package com.array.programs;

import java.util.Deque;
import java.util.LinkedList;

/*
Soln 1:
- We implement it using Deque (double ended queue), in front we put max element for window & in back, we put lower element.
- If max element is out of window, we remove from the window.
- While inserting any element, if it's bigger than element present in queue, then we remove the element from queue.
- At every step, we insert the front element of queue as it's the max element for that window.
- Time Complexity --> O(N), SC ---> O(N).
 */
public class GetMaxAllSubarraySizeK {
    public void maxElementOfKsizeSubarray(int[] arr, int k){
        if(arr.length == 0 || k <=0 || k > arr.length){
            return;
        }
        Deque<Integer> queue = new LinkedList<>();
        int i;
        for(i = 0; i < k; i++){
            while(!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]){
                queue.removeLast();
            }
            queue.addLast(i);
        }
        for(; i < arr.length; i++){
            System.out.print(arr[queue.peek()] + " ");

            while(!queue.isEmpty() && i - k >= queue.peek()){
                queue.removeFirst();
            }
            while(!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]){
                queue.removeLast();
            }
            queue.addLast(i);
        }
        System.out.print(arr[queue.peek()]);
    }

    public static void main(String[] args) {
        GetMaxAllSubarraySizeK g = new GetMaxAllSubarraySizeK();
        int arr[] = {2, 5, 4, 3, 1, 7};
        int k = 3;
        g.maxElementOfKsizeSubarray(arr, k);
    }
}
