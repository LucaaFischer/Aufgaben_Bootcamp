package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktor {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        long divider = 2;

        System.out.print("Die Zahl " + zahl + "kann in folgende Faktoren zerlegt werden: ");
        while(zahl > 1) {
            while (zahl % divider == 0) {
                System.out.print(divider + ", ");
                zahl = zahl / divider;
            }
            divider++;
        }
    }
}

