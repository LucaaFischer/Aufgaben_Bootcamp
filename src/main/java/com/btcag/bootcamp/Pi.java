package com.btcag.bootcamp;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double i = 3;
        double pi = 0;

        System.out.println("Wie viele Durchläufe sollen erfolgen?");
        long runs = eingabe.nextLong();
        long maxruns = 0;

        while(maxruns < runs) {
            while (maxruns % 2 == 0) {
                pi = 4 * (1 + (1 / i));
                maxruns++;
            }
            while (maxruns % 2 != 0) {
                pi = 4 * (1 - (1 / i));
                maxruns++;
            }
                i = i + 2;
                maxruns++;
        }
        System.out.println("Nach " + runs + " Durchläufen wurde Pi auf den Wert " + pi + " berechnet.");
    }
}
