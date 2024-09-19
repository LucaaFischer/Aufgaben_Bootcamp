package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci_Zahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bis zu welcher Zahl soll berechnet werden? ");
        int maxZahl = scanner.nextInt();

        int zahl1 = 0;
        int zahl2 = 1;
        int ergebnis = 0;
        System.out.print("Fibonacci-Zahlen bis " + maxZahl + ": ");

        while (zahl1 <= maxZahl) {
            System.out.print(zahl1 + " ");
            ergebnis = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = ergebnis;
        }
    }
}

