package com.btcag.bootcamp;
import java.util.Scanner;

public class backwards {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        String alsString;
        long alsLong;
        long umgekehrt = 0;

        System.out.println("Bitte gib eine Zahl ein");
        alsString = eingabe.nextLine();

        System.out.println("Bitte gib die Zahl nochmal ein");
        alsLong = eingabe.nextLong();

        while(alsLong > 0) {
            umgekehrt = umgekehrt * 10 + alsLong % 10;
            alsLong = alsLong / 10;
        }

        System.out.println("Deine Zahl: " + (alsString + 1));
        System.out.println("Deine Zahl: " + (alsLong + 1));
        System.out.println(("Umgekehrte Zahl: " + umgekehrt));


        // Bei der Eingabe von 01234 wird die Zahl umgekehrt ohne 0 ausgegeben. Das liegt daran, dass eine 0 am Anfang einer Zahl
        // nicht berücksichtigt wird und nicht zur Zahl "dazugehört".
        // als Long wird lediglich die 1 ausgegeben, weil
    }
}
