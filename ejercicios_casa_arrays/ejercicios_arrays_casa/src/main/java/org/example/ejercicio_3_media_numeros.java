package org.example;

import java.util.Scanner;

public class ejercicio_3_media_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pedir varios numeros al usuario, guardados en un array y luego calcular media.

        int [] numeros = new int[5];
        int suma =0;
        for (int i = 0; i<numeros.length; i++){
            System.out.println("introduce el numero" +(i+1)+ "/5");
            numeros [i] = sc.nextInt();
           suma += numeros[i];
        }

        double media = (double) suma/ numeros.length;

        for (int i =0; i< numeros.length; i++){
            System.out.println("numeros introducidos "+i+" : " +numeros[i]);
        }
        System.out.println("la media de los numeros introducidos son: "+suma);
    }
}
