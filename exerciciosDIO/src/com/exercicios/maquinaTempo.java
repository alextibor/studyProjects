package com.exercicios;

import java.util.Scanner;

public class maquinaTempo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        if (a + b == c || a + c == b || a == a || a == b || a == c || a == c) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}

