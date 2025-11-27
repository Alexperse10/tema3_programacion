package org.example;

import java.util.Scanner;

public class practica3_en_raya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tablero[][] = new int[3][3];
        int jugador = 1;

        // Inicializar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;
            }
        }

        // Mostrar tablero inicial
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {

            System.out.println("jugador " + jugador + " introduce fila:");
            int fila = sc.nextInt();

            System.out.println("jugador " + jugador + " introduce la columna");
            int columna = sc.nextInt();

            if (tablero[fila][columna] != 0) {
                System.out.println("esta casilla esta ocupada");
                continue;
            }

            tablero[fila][columna] = jugador;

            // ----------- COMPROBAR VICTORIA -----------

            // Comprobar FILA
            if (tablero[fila][0] == jugador &&
                    tablero[fila][1] == jugador &&
                    tablero[fila][2] == jugador) {
                System.out.println("¡Jugador " + jugador + " ha ganado por fila!");
                break;
            }

            // Comprobar COLUMNA
            if (tablero[0][columna] == jugador &&
                    tablero[1][columna] == jugador &&
                    tablero[2][columna] == jugador) {
                System.out.println("¡Jugador " + jugador + " ha ganado por columna!");
                break;
            }

            // Comprobar DIAGONAL principal
            if (tablero[0][0] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][2] == jugador) {
                System.out.println("¡Jugador " + jugador + " ha ganado por diagonal!");
                break;
            }

            // Comprobar DIAGONAL inversa
            if (tablero[0][2] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][0] == jugador) {
                System.out.println("¡Jugador " + jugador + " ha ganado por diagonal inversa!");
                break;
            }

            // -------------------------------------------

            // Mostrar tablero actualizado
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Cambiar de jugador
            if (jugador == 1) {
                jugador = 2;
            } else {
                jugador = 1;
            }

        } // fin del while

    }
}
