package org.example;

import java.util.Scanner;

public class ejercicios_prematrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una altura");
        int altura = sc.nextInt();

        for (int i=0; i<altura; i++){
            for (int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}