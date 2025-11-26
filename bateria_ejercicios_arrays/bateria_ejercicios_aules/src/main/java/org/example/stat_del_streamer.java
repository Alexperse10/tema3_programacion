package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class stat_del_streamer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int espectadores [] = new int[5];
        int comentarios [] = new int[5];
        System.out.println("**** Estadisticas premios ESLAND **** ");

        System.out.println("------------------------------------------");

        System.out.println("Insertar streamer a analizar: ");
        String streamer = sc.nextLine();
        System.out.println("introduce los espectadores medidos");
        for (int i =0; i< espectadores.length; i++){
            espectadores [i] = sc.nextInt();
        }
        System.out.println("los espectadores son: "+Arrays.toString(espectadores));
        System.out.println("introduce el numero de comentarios:");
        for (int i =0; i< espectadores.length; i++){
            comentarios [i] = sc.nextInt();
        }
        int max_espect=0;

        for (int i=0; i< espectadores.length; i++){
            if (espectadores[i] > max_espect){
                max_espect = espectadores[i];

            }
        }
        int min_expect=espectadores[0];
        for (int i =0; i<espectadores.length; i++) {
            if (espectadores[i]<min_expect){
                min_expect = espectadores[i];
            }
        }
        int mejor_indice=1;
        double ratio;
        double mejor_ratio=0;
        for (int i =0; i<espectadores.length; i++){
            ratio = (double) comentarios[i]/espectadores[i];
            if (ratio>mejor_ratio){
                mejor_ratio = ratio;
                mejor_indice=i+1;

            }
        }
        double racha = (double) ((max_espect - min_expect)*100)/max_espect;

        System.out.println("el numero de comentarios es: "+Arrays.toString(comentarios));

        System.out.println("-------------------------------------------------------------");

        System.out.println("resultados para el streamer");
        System.out.println("@["+streamer+"]");
        System.out.println("max: "+max_espect);
        System.out.println("min: "+min_expect );
        System.out.println("hype="+mejor_indice+ "("+mejor_ratio+")");
        System.out.println(" racha: "+racha);

    }
}
