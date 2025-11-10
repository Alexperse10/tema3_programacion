package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador =0;
        int [] numero = new int[25];
        Random aleatorio = new Random();

        for (int i=0; i< numero.length; i++){
            numero[i] = aleatorio.nextInt(101);

        }
    }
}
