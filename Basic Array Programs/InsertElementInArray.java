package com.array.programs;

public class InsertElementInArray {
    int count = 0;  // global variable take default value as zero.

    public static void main(String[] args) {
        InsertElementInArray o = new InsertElementInArray();

        int[] a = new int[5];

//        a[0] = 10;
//        a[1] = 18;
//        a[2] = 20;    ----> Instead of this we can also use for loop
//        a[3] = 21;
//        a[4] = 22;

        for(int j  = 0; j < a.length; j++){
//            a[j] = j;
            o.insert(a, j+1);  // ---> this is the way of inserting through methods.
        }
        o.print(a);

        o.insertAtStart(a, 34);

        o.print(a);

        o.inserAtPosition(a, 2, 20);

        o.print(a);
    }

//    Insert at the end
    public  void insert(int a[], int val){
        a[count++] = val;
    }

//     Insert at the start
    public void insertAtStart(int a[], int val){
        for(int i = a.length-1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[0] = val;
    }

//      Insert at any given position
    public void inserAtPosition(int a[], int position, int val){
        for(int i =count-1; i > position; i--){
            a[i] = a[i-1];
        }
        a[position] = val;
    }


//      Print Function.
    public void print(int a[]){
        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }
}
