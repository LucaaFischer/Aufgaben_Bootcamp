package com.btcag.bootcamp;

import java.util.Scanner;
import java.lang.*;

public class subNetting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Bitte gebe das erste Oktett der IP-Adresse an:");
        long oktett1 = input.nextLong();

        System.out.println("Bitte gebe das zweite Oktett der IP-Adresse an:");
        long oktett2 = input.nextLong();

        System.out.println("Bitte gebe das dritte Oktett der IP-Adresse an:");
        long oktett3 = input.nextLong();

        System.out.println("Bitte gebe das vierte Oktett der IP-Adresse an:");
        long oktett4 = input.nextLong();

        System.out.println("Bitte gebe die Subnetzmaske an:");
        long subnetzmaske = input.nextLong();

        long[] ipAddress = {oktett1, oktett2, oktett3, oktett4};
        while (i < 4) {
            while (i < 3) {
                System.out.print(ipAddress[i] + ".");
                i++;
            }
            System.out.print(ipAddress[i]);
            i++;
        }
    }
}
