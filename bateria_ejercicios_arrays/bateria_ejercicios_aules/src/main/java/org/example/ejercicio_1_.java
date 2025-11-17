package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int [] numero = new int[8];
        int suma =0;
        for (int i =0; i< numero.length; i++){
            numero[i] = aleatorio.nextInt(501);
            System.out.println("el numero " +(i+1)+ " es "+numero[i]);
            suma += numero[i];
        }
        System.out.println("la suma de todos los numero es: "+suma);
    }
}
