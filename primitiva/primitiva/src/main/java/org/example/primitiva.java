package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();


        int [] reintegro = new int[1];
        int [] complementario = new int[1];
        int [] numero_completo = new int[8];
        boolean repetir = false;
        int [] sorteo = new int[6]; // creo un vector para realizar el sorteo, este vector lo rellono con los numeros aleatorios

            System.out.println("introduce los datos de tu boleto");
            String numero_complete = sc.nextLine();
                // se valida el formato
                if (numero_complete.matches("\\d{1}-\\d{1}-\\d{1}-\\d{1}-\\d{1}-\\d{1}/\\d{1}")) {
                    System.out.println("formato correcto");
                    //aqui creo el array
                    String [] numero_fragmentado = numero_complete.split("[-/]"); // lo creo en partes
                    System.out.println(Arrays.toString(numero_fragmentado)); // miro como queda el array
                    int [] numero = new int[numero_fragmentado.length];  // creo un array de la longitud del numero de tipo int

                    for (int i =0; i<numero_fragmentado.length; i++){ //convertir de strings a numeros enteros.
                        numero [i] = Integer.parseInt(numero_fragmentado[i]); //los siete numeros

                    }

                    int [] seisnumeros = new int [6]; // creo el array para los primeros seis numeros, este array esta vacio

                    for (int i =0; i<6; i++){
                        seisnumeros [i] = numero[i]; // aqui hago un copia pega de los primeros 6 numeros
                    }
                    reintegro [0] = numero [6];
                }else {
                    System.out.println("saliendo del programa...");
                }



    }
}
