package com.exercicios;
import java.io.IOException;
import java.util.Scanner;
//MAQUINA DO TEMPO
public class Teste1 {

    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        if (a + b == c || a + c == b || b + c == a || b == c ||a == c || a == b ){
            System.out.println("S");
        } else { 
            System.out.println("N");
        }
    }
}

