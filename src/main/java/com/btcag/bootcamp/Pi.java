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
            i = i+2;
            while (runs % 2 == 0) {
                ergebnis *= 1.0 + (1.0 / i);
                runs++;
            }
            while (runs % 2 != 0) {
                ergebnis *= 1.0 - (1.0 / i);
                runs++;
            }
        }
        pi = 4* ergebnis;
        System.out.println("Nach " + runs + " Durchläufen wurde Pi auf den Wert " + pi + " berechnet.");
    }
}
