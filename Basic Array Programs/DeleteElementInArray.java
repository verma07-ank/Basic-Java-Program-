package com.array.programs;
/*
Time Complexity ---> O(N - 1)
 */
public class DeleteElementInArray {

    static int count = 5;

    public static void main(String[] args) {

        int a[] = {12, 34, 45, 6, 13};
        DeleteElementInArray obj = new DeleteElementInArray();
        obj.print(a);
//        obj.deleteFromEnd(a);
//        obj.print(a);
//        obj.deleteValue(a,7);
//        obj.print(a);
        obj.deleteFromPosition(a, 41);
        obj.print(a);
    }
//  -------> Delete value from end.

    public void deleteFromEnd(int a[]) {
        if (a.length <= 0)
            return;
    count--;
}
// ---------> Delete a value from array.
    public void deleteValue(int a[], int val){
        int i;
        for(i = 0; i < count; i++){
            if(a[i] == val){
                break;
            }
        }
        if(i == count){
            System.out.println("Value doesn't exists in an array");
            return;
        }
        for(int j = 1; j < count-1; j++){
            a[j] = a[j+1];
        }
        count--;
    }
// ----------> Delete from a particular position.

    public void deleteFromPosition(int a[], int position){
        if(position > count || position <= 0){
            System.out.println("Invalid Position");
            return;
        }
        for(int i = position-1; i < count-1; i++){
            a[i] = a[i+1];
        }
        count--;
    }
    public void print(int[] a){
    for(int i = 0; i < count; i++){
        System.out.print(a[i] +" ");
    }
        System.out.println();
    }
}
