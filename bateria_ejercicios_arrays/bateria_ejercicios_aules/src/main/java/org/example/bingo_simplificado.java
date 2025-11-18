package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bingo_simplificado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int [] numero = new int[25];
            int [] numero_usuario = new int[5];
            Random aleatorio = new Random();
            int contador =0;
            //pido al usuario que introduzca cinco numeros
        for (int i = 0; i< numero_usuario.length; i++) {
            System.out.println("introduzca  numero" +(i+1));
            numero_usuario[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numero_usuario));
            //muestro esos cinco numeros
            System.out.println(" tus numeros son: " + Arrays.toString(numero_usuario));
            //relleno numeros de
            for (int i =0; i<numero.length; i++){
                numero [i] = aleatorio.nextInt(50)+1;
            }
            System.out.println("los numeros del bingo son: "+Arrays.toString(numero));

            for (int i =0; i< numero_usuario.length; i++){
                for (int j =0; j< numero.length; j++){
                    if (numero_usuario [i] == numero[j]) {
                        contador ++;
                    }

                }
            }
        if (contador == 5){
            System.out.println("enhorabuena has tenido 5 aciertos");
        } else if (contador == 3 || contador == 4) {
            System.out.println("casi bingo");
        } else if (contador == 1 || contador == 2) {
            System.out.println("poco afortunado");
        }else {
            System.out.println("mala suerte");
        }
        }
    }

