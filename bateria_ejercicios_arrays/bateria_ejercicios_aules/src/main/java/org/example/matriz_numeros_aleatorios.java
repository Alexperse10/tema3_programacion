package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class matriz_numeros_aleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("introduce el numero de filas");
        int filas = sc.nextInt();

        System.out.println("introduce el numero de columnas");
        int columnas = sc.nextInt();

        int total = filas * columnas;
        int generados [] = new int[total*5];
        for (int i =0; i<generados.length; i++){
            generados [i] = aleatorio.nextInt(1,100);
        }
        int [] sinrepes = Arrays.stream(generados).distinct().limit(total).toArray();
        int indice =0;
        int matriz [][] = new int[filas][columnas];
        for (int i =0; i<filas; i++){
            for (int j =0; j<columnas; j++){
                 matriz [i][j] = sinrepes[indice];
                    indice++;

            }
        }
        for (int i =0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
