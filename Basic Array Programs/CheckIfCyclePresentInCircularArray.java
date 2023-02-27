package com.array.programs;
/*
Soln -
- We'll take two variable slow & fast.
- Here each value represent the jump it'll make positive means forward direction & negative means backward direction.
- Slow will move by 1 position & fast will move by 2 position. If slow & fast meet at any index, then it means cycle is possible.
- We'll iterate for each point & if any case, it's not possible, then we check for next index.
- If we don't find cycle, then we return false.
- Time Complexity --> O(N * N), Space Complexity ---> O(1)
 */
public class CheckIfCyclePresentInCircularArray {
    public static boolean checkIfCircularArrayHasCycle(int[] arr){
        if(arr.length <= 1){
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            int slow, fast ;
            slow = fast = i;
            boolean ifForward = arr[i] > 0;

            while(true){
                slow = getNextPosition(arr, slow, ifForward);
                if(slow == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, ifForward);
                if(fast == -1){
                    break;
                }
                fast = getNextPosition(arr, fast, ifForward);
                if(fast == -1){
                    break;
                }
                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }
    private static int getNextPosition(int[] arr, int index, boolean ifForward){
        boolean direction = arr[index] >= 0;

        if(direction != ifForward){
            return -1;
        }
        int nextIndex = (index + arr[index]) % arr.length;

        if(nextIndex < 0){
            nextIndex = nextIndex + arr.length;
        }
        if(nextIndex == index){
            return -1;
        }
        return nextIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 2};
        System.out.println(CheckIfCyclePresentInCircularArray.checkIfCircularArrayHasCycle(arr));
    }
}
