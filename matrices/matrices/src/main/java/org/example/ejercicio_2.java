package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        Random aleatorio = new Random();
        System.out.println("matriz primera");
        for (int i =0;i<matriz1.length; i++){
            for (int j =0; j<matriz1.length; j++){
                matriz1 [i][j] = aleatorio.nextInt(100);
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("matriz segunda");
        for (int i =0; i<matriz2.length; i++){
            for (int j=0; j<matriz2.length; j++){
                matriz2 [i][j] = aleatorio.nextInt(100);
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matriz creada con numeros maximos");
        for (int i =0; i<matriz2.length; i++){
            for (int j=0; j<matriz2.length; j++){
                if (matriz1[i][j]>matriz2[i][j]){
                    System.out.print(matriz1[i][j]+" ");
                }else {
                    System.out.print(matriz2[i][j]+" ");
                }

            }
            System.out.println(" ");
        }
    }
}
