package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Scanner;

/**
 * Type of Fuel
 */
public class BEE1134 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
