package com.btcag.bootcamp;

import java.util.Scanner;

public class crypticNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte die Zahl eingeben");
        long zahl = input.nextLong();
        System.out.println(zahl);

        System.out.println("Bitte Passwort-Zahl eingeben");
        long pw = input.nextLong();
        System.out.println(pw);

        long result = 0;
    }
}
