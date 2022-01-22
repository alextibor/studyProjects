package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();

        C = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", C);
    }
}
