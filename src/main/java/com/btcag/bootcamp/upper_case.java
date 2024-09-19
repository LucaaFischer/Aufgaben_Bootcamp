package com.btcag.bootcamp;

import java.util.Scanner;

public class upper_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib einen String ein, nur kleine Buchstaben.");
        String lowerCase = input.nextLine();

        String illegal = lowerCase.toUpperCase();
        System.out.println(illegal);

        int i = 0;
        int length = lowerCase.length();
        char[] lowerChars = lowerCase.toCharArray();

        while(i< length) {
            char lowerChar = lowerChars[i];
            System.out.print(lowerChars);
            i++;
        }
    }
}



