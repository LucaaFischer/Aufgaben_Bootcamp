package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        int divider = 2;
        boolean prime = true;
        boolean dontSkip = true;

        while (divider < zahl) {
            dontSkip = true;
            while (zahl % divider == 0) {
                prime = false;
                divider++;
                dontSkip = false;
            }
            while (dontSkip) {
                dontSkip = false;
                divider++;
            }
        }
        System.out.println("Ergebnis: " + prime);
    }
}