package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII2 {
    public static void main(String[] args) {
        Scanner sterne = new Scanner(System.in);
        System.out.println();
        System.out.println("Gib eine Zahl > 0 ein");
        int dreieck = sterne.nextInt();
        char stern = 42;
        int i = 0;
        int j = 0;
        while (i < dreieck) {
            i++;
            j = dreieck;
            System.out.println();
            while (j >= i) {
                System.out.print(stern);
                j--;
            }
        }
        while (i < dreieck) {
            i++;
            j = 0;
            System.out.println();
            while (j < i) {
                System.out.print(stern);
                j++;
            }
        }
        System.out.println();
        i = 0;
        while (i < dreieck) {
            i++;
            j = 0;
            System.out.println();
            while (j < i) {
                System.out.print(stern);
                j++;
            }
        }
    }
}
