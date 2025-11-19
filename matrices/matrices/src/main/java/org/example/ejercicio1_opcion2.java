package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1_opcion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int [][] matriz = new int[4][4];

        for (int i =0; i< matriz.length; i++){
            for (int j =0; j< matriz[i].length; j++){
                 matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        for (int i=0; i< matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for (int i =0; i< matriz.length; i++){
            int j = matriz.length -i -1;
            System.out.println(matriz[i][j]);
            }

        }
    }

