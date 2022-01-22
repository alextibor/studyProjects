package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Scanner;

/**
 * Fixed Password
 */

public class BEE1114 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int InputSenha = sc.nextInt();

        while(InputSenha != senhaCorreta){
            System.out.println("Senha Invalida");
            InputSenha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
