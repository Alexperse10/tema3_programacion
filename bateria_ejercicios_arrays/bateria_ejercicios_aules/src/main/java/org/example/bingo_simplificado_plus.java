package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bingo_simplificado_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        String fila_usuario;

        for (int i = 0; i < 3; i++) {
            System.out.println("introduce los numero en tu carton");
            fila_usuario = sc.nextLine();

            if (!fila_usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                System.out.println("el numero es incorrecto");
                return;
            }

            String[] fila_usuario_fragmentado = fila_usuario.split("[-]");
            for (i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = Integer.parseInt(fila_usuario_fragmentado[j]);
                }
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(" ");
            }

        }
    }
}

