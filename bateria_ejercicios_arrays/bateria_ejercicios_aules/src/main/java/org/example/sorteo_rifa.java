package org.example;

import java.util.Random;
import java.util.Scanner;

public class sorteo_rifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero_usuario = new int[10];
        Random aleatorio = new Random();
        int [] rango_aleatorio = new int [5];
        for (int i =0; i< rango_aleatorio.length; i++ ) {
            rango_aleatorio [i] = aleatorio.nextInt(100)+1;

        }
    }
}
