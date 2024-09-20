package com.btcag.bootcamp;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double i = 1;
        double pi = 0;
        double ergebnis = 1;

        System.out.println("Wie viele Durchläufe sollen erfolgen?");
        long maxruns = eingabe.nextLong();
        long runs = 0;

        while (runs < maxruns) {
            while (runs % 2 == 0) {
                ergebnis = 4 * (1 - (1 / i));
                pi = ergebnis;
                runs++;
                i = i+2;
            }
            while (runs % 2 != 0) {
                ergebnis =  4 * (1 + (1/ i));
                pi = ergebnis;
                runs++;
                i=i+2;
            }
        }
        System.out.println("Nach " + runs + " Durchläufen wurde Pi auf den Wert " + pi + " berechnet.");
    }
}
