package com.btcag.bootcamp;
import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        long zahl = eingabe.nextLong();
        long i = 0;

        while(zahl % zahl == 0 ) {
            while (zahl % 1 == zahl) {
                System.out.println("Die Zahl" + zahl + "ist eine Primzahl");
            }
        }
    }
}
