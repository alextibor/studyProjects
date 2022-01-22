package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        raio = sc.nextDouble();

        area = pi * (Math.pow(raio, 2));

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}