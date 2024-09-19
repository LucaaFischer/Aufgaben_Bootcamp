package com.btcag.bootcamp;

public class Main {
    public static void main(String[] args) {
        int test = 0;
        int test2 = 0;
        while (test < 10) {
            test++;
            ++test2;
            System.out.println(test + "++");
            System.out.println("++" + test2);
        }
    }
}