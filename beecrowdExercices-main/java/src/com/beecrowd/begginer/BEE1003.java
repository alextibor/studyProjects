package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, sum;

        A = sc.nextInt();
        B = sc.nextInt();
        sum = A + B;

        System.out.println("SOMA = " + sum);

        sc.close();
    }
}
