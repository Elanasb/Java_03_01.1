package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        Parasysti programa kuri paprasytu sveiko skaiciaus ir pasakytu ar tas dalinasi is 3 arba 5 arba 7.
         */

        System.out.println("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 7 == 0) {
            System.out.println("Skaicius dalinasi is 7");
        } else {
            if (a % 5 == 0) {
                System.out.println("Skaicius dalinasi is 5");
            } else {
                if (a % 3 == 0) {
                    System.out.println("Skaicius dalinasi is 3");
                }
            }
        }

    }
}
