package com.beecrowd.begginer;

import java.io.IOException;
import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int in = 0, out = 0;
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            } else{
                out++;
            }
        }
        System.out.println(in + " in" + "\n" +
                + out +" out");
    }
}
