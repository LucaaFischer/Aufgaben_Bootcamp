package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        int divider = 2;
        boolean prime = false;

        while(zahl > 1) {
            while (zahl % divider == 0) {
                prime = true;
                zahl = zahl / divider;
            }
            divider++;
        }
        System.out.println("Ergebnis: " + prime);
    }
}