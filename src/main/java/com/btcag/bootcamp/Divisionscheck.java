package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner eingabe_divisor = new Scanner(System.in);
        Scanner eingabe_maxZahl = new Scanner(System.in);

        int i = 1;

        System.out.println("Welcher Divisor soll geprüft werden");
        int divisor = eingabe_divisor.nextInt();
        System.out.println("Bis zu welcher Zahl?");
        int maxZahl = eingabe_maxZahl.nextInt();

        while (i <= maxZahl) {
            int ergebnis = i % divisor;
            i++;
            System.out.println(ergebnis);
        }
    }
}
