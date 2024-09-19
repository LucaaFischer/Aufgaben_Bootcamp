package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        long i = 0;
        long divider = 1;
        String ergebnis = "Primzahl";

        while (zahl % divider == 0) {
            while (zahl != divider) {
                ergebnis = "Keine Primzahl";
                divider++;
            }
        }
        System.out.println(ergebnis);
    }
}