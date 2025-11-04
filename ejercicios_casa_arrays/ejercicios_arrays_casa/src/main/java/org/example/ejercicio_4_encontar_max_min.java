package org.example;

import java.util.Scanner;

public class ejercicio_4_encontar_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[5];
        for (int i =0; i< numero.length; i++){
            System.out.println("introduce el numero "+(i+1));
            numero[i] = sc.nextInt();
        }
        int maximo = numero[0];
        int minimo=numero[0];
        for (int i =0; i< numero.length; i++){
            if (numero[i]>maximo){
                maximo = numero[i];
            }if (numero[i]<minimo){
                minimo = numero[i];
            }

        }
        System.out.println(maximo);
        System.out.println(minimo);
    }


}
