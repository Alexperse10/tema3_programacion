package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bingo_3por3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int sorteo[] = new int[20];
        int matriz_int [][] = new int[3][3];
        String matriz[][] = new String[3][3];
        String linea;
        String [] partes;



        for (int i = 0; i < 3; i++) {
            System.out.println("introduce los numeros en formato correcto");
            linea = sc.nextLine();
            if (!linea.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")){
                System.out.println("el formato es incorrecto");
                return;
            }
             partes = linea.split("-");
            for (int j=0; j<3; j++){
                matriz[i][j] = partes[j];
            }
        }


        for (int i =0; i <matriz.length; i++){
            for (int j =0; j< matriz[i].length; j++){
                matriz_int [i][j] = Integer.parseInt(matriz[i][j]);

            }

        }
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz_int[i][j]+ " ");
            }
            System.out.println();
        }
            int generados [] = new int[200];
        // generar bolar sin repetir numeros

            for (int i = 0; i < generados.length; i++) {
                generados[i] = aleatorio.nextInt(1, 90);

            }
            int sinduplicados[] = Arrays.stream(generados).distinct().toArray();

            for (int i =0; i< sorteo.length; i++){
                sorteo[i] = sinduplicados[i];
            }

    }
}