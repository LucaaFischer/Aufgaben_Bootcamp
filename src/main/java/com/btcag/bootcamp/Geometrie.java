package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrie {
    // Kreis
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Geben Sie den Radius des Kreises ein");
        double radius = eingabe.nextDouble();

        double ergebnis = 3.14 * Math.sqrt(radius);

        System.out.println("Kreisfläche: " + ergebnis + "^2cm");

        // Rechteck
        Scanner eingabe_lenght = new Scanner(System.in);
        Scanner eingabe_height = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Rechtecks ein");
        double lenght = eingabe_lenght.nextDouble();
        System.out.println("Geben Sie die Höhe des Rechtecks ein");
        double height = eingabe_height.nextDouble();

        double flaeche = lenght * height;
        System.out.println("Flächeninhalt Rechteck: " + flaeche + "cm^2");

    }
}
