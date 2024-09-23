package com.btcag.bootcamp;
import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden:");
        long produkte = input.nextInt();
        double sum = 0;
        double euro = 0;
        long gegeben = 0;
        double change = 0;
        double eurogegeben = 0;
        double ausgabe = 0;

        while(produkte != 0) {
            produkte = input.nextLong();
            sum += produkte;
        }
        euro = sum / 100;
        System.out.println("Die Summe aller Produkte beläuft sich auf " + euro + "Euro.");

        System.out.println("Wie viel hat der Kunde gegeben (Centbetrag)?");
        gegeben = input.nextLong();
        eurogegeben = (double) gegeben / 100;
        change = eurogegeben - euro;
        System.out.println("Bitte folgendes Geld zurückgeben: (" + change + ")");

        while(ausgabe < change) {

        }
    }
}
