package com.btcag.bootcamp;
import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = eingabe.nextLong();
        long i = 0;
        if(zahl % zahl == 0 && zahl % 1 == 0) {
            System.out.println("Die Zahl ist eine Primzahl");
        }
        else{
            System.out.println("Die Zahl ist keine Primzahl");
        }
    }
}
