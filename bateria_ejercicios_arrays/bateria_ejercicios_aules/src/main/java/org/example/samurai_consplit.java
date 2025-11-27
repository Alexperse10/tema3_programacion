package org.example;

import java.util.Scanner;

public class samurai_consplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador1;
        String linea2;
        int jugador_1_[] = new int[7];
        int jugador2[] = new int[7];
        int suma=0;

        do {
            suma=0;
            System.out.println("introducir la potencia de los 7 samurais");
            jugador1 =sc.nextLine();
            String partes [] = jugador1.split(" ");
            if (partes.length!=7){
                System.out.println("Error no has introducido 7 numeros");
                continue;
            }
            for (int i =0; i< partes.length; i++){
                int potencia = Integer.parseInt(partes[i]);
                if (potencia<1 || potencia>24){
                    System.out.println("ERROR la potencia tiene que estar entre 1 y 24");
                    suma = -1;
                    break;
                }
                jugador_1_[i] = potencia;
                suma += potencia;
            }
            if (suma !=30){
                System.out.println("Error los suma de los samurais debe ser 30");
            }
        }while(suma !=30);

        do {
            suma =0;
            System.out.println("introduce la potencia de los siete samurais");
            linea2 = sc.nextLine();
            String partes_2 [] = linea2.split(" ");
            if (partes_2.length!=7){
                System.out.println("ERROR deben de haber siete numeros");
                continue;
            }
            for (int i =0; i< partes_2.length; i++){
                int potencia_2 = Integer.parseInt(partes_2[i]);

                if (potencia_2<1 || potencia_2>24){
                    System.out.println("Eroor los numeros deben estar entre 1 y 24");
                    suma = -1;
                    break;
                }
                jugador2 [i] = potencia_2;
                suma += potencia_2;
            }
        }while (suma !=30);


    }
}
