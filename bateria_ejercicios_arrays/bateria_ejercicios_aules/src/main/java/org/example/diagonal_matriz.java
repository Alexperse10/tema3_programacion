package org.example;

import java.util.Scanner;

public class diagonal_matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        // Rellenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Introduce número para [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz completa
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar diagonal principal
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
