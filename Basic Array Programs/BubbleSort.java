package com.array.programs;
/* In Bubble Sort (means they always check the next bubble) - Time Complexity --> O(N^2)
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the
adjacent elements if they are in the wrong order. This algorithm is not suitable for
large data sets as its average and worst-case time complexity is quite high.

******************************************************************************

Bubble sort starts with very first two elements, comparing them to check which one is greater.
12, 5 ,3 ,-1  ---> it will check 12 > 5 or not and so on until it will reach to the last index.
5, 12, 3, -1 ---> 5, 3, 12, -1 ---> 5, 3, -1, 12 ---> now 12 reached to its correct position.
Now we will run the loop till 3 values i.e till 5, 3,-1.
Again we will swap the position accordingly till we sort the values in desired o/p. i.e -1, 3, 5, 12.
*/
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {12, 5, 3, -1};
        BubbleSort obj = new BubbleSort();
        obj.print(a);
        obj.bubbleSort(a);
        obj.print(a);
    }

    public void bubbleSort(int a[]){
        if(a.length == 0 || a.length == 1){
            return;
        }
        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j] > a[j+1]){
                    int x = a[j];
                    a[j] = a[j+1];
                    a[j+1] = x;
                }
            }
        }
    }
    public void print(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
