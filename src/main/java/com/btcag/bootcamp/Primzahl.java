package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        int zahl = eingabe.nextInt();
        int divider = 2;
        boolean prime = true;

        while(zahl % divider == 0 && zahl != divider) {
            prime = false;
            divider++;
        }
        System.out.println("Ergebnis: " + prime);
    }
}