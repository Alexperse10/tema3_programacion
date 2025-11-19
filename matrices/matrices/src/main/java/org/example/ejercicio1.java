package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [4][4]; // son cuatro posiciones
        Random aleatorio = new Random();
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz[i][j] = aleatorio.nextInt(100);
            }


            }
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.println();

        }

        for (int i =0; i< matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz [i][j] = aleatorio.nextInt(100);
            }
        }
        for (int i =0; i< matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                if (i == j){
                    System.out.println(matriz[i][j]+" ");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }


    }
}

