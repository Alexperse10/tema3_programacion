package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bingo_simplificado_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        String fila_usuario;
        Random aleatorio = new Random();
        int[] bolas = new int[30];
        for (int i = 0; i < 3; i++) {
            System.out.println("introduce los numero en tu carton");
            fila_usuario = sc.nextLine();

            if (!fila_usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                System.out.println("el numero es incorrecto");
                return;
            }

            String[] fila_usuario_fragmentado = fila_usuario.split("-");

            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(fila_usuario_fragmentado[j]);
            }
        }

        // Mostrar la matriz una vez que está completa
        System.out.println("\nCartón introducido:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int duplicados[] = new int[30];
        do {

            for (int i = 0; i < bolas.length; i++) {
                duplicados[i] = aleatorio.nextInt(90) + 1;
            }
            bolas = Arrays.stream(duplicados).distinct().toArray();
        } while (bolas.length < 30);

        System.out.println(Arrays.toString(bolas));
        int contador = 0;
        int contadorfila=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < bolas.length; k++) {
                    if (matriz[i][j] == bolas[k]) {
                        contador++;
                        contadorfila++;
                        break;
                    }
                }
            }
            if (contador == 9){
                System.out.println("bingooooo");
        }

        }
            if (contadorfila == 3) {
            System.out.println("has acertado linea");
        }
    }
}
