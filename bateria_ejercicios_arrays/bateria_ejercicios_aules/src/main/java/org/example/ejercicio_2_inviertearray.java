package org.example;

import java.util.Scanner;

public class ejercicio_2_inviertearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = {9,10,11,15,20,7,8,3};
        int [] invertido = new int[numeros.length];

        for (int i =0; i< numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
        for (int i =0; i< numeros.length; i++){
            invertido[i] = numeros[numeros.length-1-i];
        }
        for (int i =0; i< numeros.length; i++){
            System.out.print(invertido[i]+ " ");
        }
    }
}
