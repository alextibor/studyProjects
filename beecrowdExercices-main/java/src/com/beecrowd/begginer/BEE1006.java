package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, M;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        M = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", M);
    }
}
