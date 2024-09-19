package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        //Aufgabe A
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Gib eine Zahl > 0 ein");
        int größe = eingabe.nextInt();
        char stern = 42;
        int i = 0;
        int j = 0;

        while (i < größe) {
            i++;
            j = 0;
            System.out.println();
            while (j < größe) {
                System.out.print(stern);
                j++;
            }
        }

        // Aufgabe b
        Scanner sterne = new Scanner(System.in);
        System.out.println();
        System.out.println("Gib eine Zahl > 0 ein");
        int dreieck = eingabe.nextInt();
        i = 0;
        j = 0;
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