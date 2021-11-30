package com.nelio;

import com.nelio.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class averagePrice {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average Price = %.2f%n", avg);

        sc.close();
    }
}
