package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;

        System.out.println("x = " + x);

        input.close();
    }
}
