package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Area
 */

public class BEE1012 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double PI = 3.14159;
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double areaTrianguloRetangulo = (A * C) / 2.0;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) + C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        input.close();
    }
}
