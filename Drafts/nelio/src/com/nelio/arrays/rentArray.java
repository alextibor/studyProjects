package com.nelio.arrays;

import com.nelio.model.Rent;

import java.util.Locale;
import java.util.Scanner;

public class rentArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int rooms = sc.nextInt();
        String dummy = sc.nextLine();
        Rent[] vect = new Rent[rooms];

        for (int i = 0; i < rooms; i++) {
            int id = i;
            System.out.println("Qual é o seu nome?");
            String name = sc.nextLine();
            System.out.println("Qual é o seu email?");
            String email = sc.nextLine();
            System.out.println("Qual quarto você deseja?");
            int room = sc.nextInt();
            String dummy2 = sc.nextLine();
            vect[i] = new Rent(id, name, email, room);
        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i < rooms ; i++) {
            System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
        }

    }
}
