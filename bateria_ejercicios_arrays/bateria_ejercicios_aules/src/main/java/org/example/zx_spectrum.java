package org.example;

import java.util.Scanner;

public class zx_spectrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho;
        int alto;


        System.out.println("**** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        do {
            System.out.println("introduce el ancho");
            ancho = sc.nextInt();
            if ((ancho> 48 || ancho<0) || ancho%8!=0){
                System.out.println("Error el valor debe ser menor igual a 48 y mayor igual a 0");
            }
        } while ((ancho > 48 || ancho<0) || ancho%8!=0) ;
            do {
                System.out.println("introduce el alto");
                alto = sc.nextInt();
                if (alto>48){
                    System.out.println("Error el valor debe de ser menor igual que 48 y mayor igual a 0");
                }
            } while ((alto > 48 || alto<0) || alto%8!=0);

        int pantalla [][] = new int[ancho][alto];

            System.out.println("introduce linea a linea los colores de tu imagen para cada pixel");


        }
    }

