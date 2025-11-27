package org.example;

import java.util.Scanner;

public class introducir_lineas_sumar_formato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero= "";
        String numero_partes [];
        System.out.println("cuantas filas es tu matriz");
        int filas = sc.nextInt();
        System.out.println("cuantas columnas es tu matriz");
        int columnas = sc.nextInt();
        sc.nextLine();
        int matriz [][] = new int[filas][columnas];
        String patron = "\\d{1,2}";
        for (int x = 1; x<columnas; x++){
            patron += "-\\d{1,2}";
        }
        for (int i =0; i<filas; i++){
            System.out.println("introduce los numeros de tu matriz");
             numero = sc.nextLine();
            if (!numero.matches(patron)){
                System.out.println("el formato es incorrecto");
                return;
            }
             numero_partes = numero.split("-");
            for (int j=0; j<columnas; j++){
                matriz [i][j] = Integer.parseInt(numero_partes[j]);
        }

        }
        int filacentral = filas/2;
        int suma =0;
        for (int j=0; j<columnas; j++){
            suma += matriz [filacentral][j];
            }
        System.out.println(suma);
        }
        }



