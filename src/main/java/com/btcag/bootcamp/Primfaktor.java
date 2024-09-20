package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktor {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        int divider = 2;
        boolean prime = true;
        int i = 0;
        long ergebnis = 0;

        if (zahl % divider == 0 && zahl != divider) {
            prime = false;
        }
        if (prime) {
            while (i < zahl) {
                ergebnis = zahl / divider;
                i++;
                String[] output = (String[]) ergebnis[i];
            }
        }
        System.out.println("Ergebnis: " + ergebnis);
    }
}

