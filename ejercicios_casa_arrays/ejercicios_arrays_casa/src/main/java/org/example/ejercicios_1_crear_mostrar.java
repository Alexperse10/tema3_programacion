package org.example;

import java.util.Scanner;

public class ejercicios_1_crear_mostrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [5]; // creamos el array de 5 numeros enteros

        // introducimos los numeros de cada posicion

        numeros [0] = 10;
        numeros [1] = 30;
        numeros [2] = 40;
        numeros [3] = 60;
        numeros [4] = 80;


        System.out.println("contenido del array");
        for (int i = 0; i< numeros.length; i++){  // con un for recorro y muestro todas las posiciones, el length cuantas posiciones tiene el array
            System.out.println("posicion" +i+":"+numeros[i]);
        }


    }
}
