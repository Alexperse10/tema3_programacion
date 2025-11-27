package org.example;

import java.util.Scanner;

public class samurais_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugador1[] = new int[7];
        int jugador2[] = new int[7];
       int suma =0;
        do {
             suma=0;
            for (int i = 0; i < 7; i++) {
                System.out.println("introduce el samurai numero " + (1 + i));
                jugador1[i] = sc.nextInt();
                if (jugador1[i]>24 || jugador1[i]<1){
                    System.out.println("Error la potencia debe estar entre 1 y 24");
                    continue;
                }
                suma += jugador1[i];

            }
            if (suma!=30){
                System.out.println("Error el jugador debe asignar un total de 30 unidades");
            }

        }while (suma!=30);

        do {
            suma=0;
            for (int i =0; i<7; i++){
                System.out.println("Introduce el samura numero" +(i+1));
                jugador2 [i] = sc.nextInt();
                if (jugador2[i]<1 || jugador2[i]>24){
                    System.out.println("ERROR el jugador debe tener potencia de 1 y 24");
                    continue;
                }

                suma += jugador2[i];
            }
        }while(suma!=30);
    }
}
