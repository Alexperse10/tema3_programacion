package org.example;

import java.util.Arrays;
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

        char pantalla [][] = new char[alto][ancho]; // alto lo he puesto como la i y el ancho la j
        // tener en cuenta que cada valor de ancho(j) es una columna
            for (int i=0; i< alto; i++) {
                System.out.println("introduce linea a linea los colores de tu imagen para cada pixel, linea "+(i+1));
                String linea = sc.next();
                if (linea.matches("[a-oA-O]+")){
                    System.out.println("coincide");
                }else{
                    System.out.println("no coincide");
                    break;

                }
                for (int j = 0; j < ancho; j++) {
                    pantalla[i][j] = linea.charAt(j); // guarga el valor de j en cada posicion
                    if (pantalla[i][j] = Arrays.stream().distinct().toArray()){

                    }
                }

            }

            for (int i =0; i<alto; i++){
                for (int j=0; j< ancho; j++){
                    System.out.print(pantalla[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

