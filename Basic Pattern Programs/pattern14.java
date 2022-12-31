package com.pattern.programs;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int v = x * i;
            System.out.println(x + " * " + i + " = " + v);
        }
    }
}