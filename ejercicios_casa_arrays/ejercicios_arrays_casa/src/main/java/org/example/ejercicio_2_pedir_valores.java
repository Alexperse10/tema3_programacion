package org.example;

import java.util.Scanner;

public class ejercicio_2_pedir_valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) { // con un for recorro todos los numero y guardo un valor pedido por teclado para cada numero
            System.out.println("introduce numeros" + i + ":");
            numeros[i] = sc.nextInt();

        }
        for (int i =0; i< numeros.length; i++) {  // aqui muestro cada numero del array guardado
            System.out.println("posicion" +i+ ":" +numeros[i]);
        }
    }
}
