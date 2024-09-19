package org.example;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ");

        long Zahl = scanner.nextLong();
        long ergebnis = 0;

        String zahlString = Zahl + "";

        int length = zahlString.length();

        while (length > 0) {
            String stellenwert = String.valueOf(zahlString.charAt(length - 1));
            ergebnis += Long.parseLong(stellenwert);

            length--;
        }

        System.out.println("Die Quersumme ist: " + ergebnis);
    }
}