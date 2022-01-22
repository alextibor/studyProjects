package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Banknotes and Coins
 */

public class BEE1021 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double entryValue = sc.nextDouble();
        int value = 0;

        System.out.println("NOTAS:");
        value = (int) entryValue / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", value);
        entryValue = entryValue % 100.0;

        value = (int) entryValue / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", value);
        entryValue = entryValue % 50.0;

        value = (int) entryValue / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", value);
        entryValue = entryValue % 20.0;

        value = (int) entryValue / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", value);
        entryValue = entryValue % 10.0;

        value = (int) entryValue / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", value);
        entryValue = entryValue % 5.0;

        value = (int) entryValue / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", value);
        entryValue = entryValue % 2.0;

        entryValue = entryValue * 100.0;

        System.out.println("MOEDAS:");

        value = (int) entryValue / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", value);
        entryValue = entryValue % 100.0;

        value = (int) entryValue / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", value);
        entryValue = entryValue % 50.0;

        value = (int) entryValue / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", value);
        entryValue = entryValue % 25.0;

        value = (int) entryValue / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", value);
        entryValue = entryValue % 10.0;

        value = (int) entryValue / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", value);
        entryValue = entryValue % 5.0;

        value = (int) entryValue / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", value);
        entryValue = entryValue % 1.0;

        sc.close();
    }
}
