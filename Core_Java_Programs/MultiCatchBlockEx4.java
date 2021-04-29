package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx4 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occur");
            int a1[] = new int[10];

            try {
                a1[5] = 30;
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Array of Indice Exception occur");
            }
        }
        System.out.println("rest of code");
    }
}