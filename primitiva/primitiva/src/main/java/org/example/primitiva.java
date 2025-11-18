package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();


        int[] numero_completo = new int[8];
        boolean repetir = false;
        int[] sorteonumero = new int[6]; // creo un vector para realizar el sorteo, este vector lo relleno con los numeros aleatorios

        System.out.println("introduce los datos de tu boleto");
        String numero_complete = sc.nextLine();
        // se valida el formato
        if (numero_complete.matches("\\d{1}-\\d{1}-\\d{1}-\\d{1}-\\d{1}-\\d{1}/\\d{1}")) {
            System.out.println("formato correcto");
            //aqui creo el array
            String[] numero_fragmentado = numero_complete.split("[-/]"); // lo creo en partes
            System.out.println(Arrays.toString(numero_fragmentado)); // miro como queda el array
            int[] numero = new int[numero_fragmentado.length];  // creo un array de la longitud del numero de tipo int

            for (int i = 0; i < numero_fragmentado.length; i++) { //convertir de strings a numeros enteros.
                numero[i] = Integer.parseInt(numero_fragmentado[i]); //los siete numeros

            }

            int[] seisnumeros = new int[6]; // creo el array para los primeros seis numeros, este array esta vacio

            for (int i = 0; i < 6; i++) {
                seisnumeros[i] = numero[i]; // aqui hago un copia pega de los primeros 6 numeros
            }
            int[] duplicados =new int[6]; // se crea array vacio para rellenarlo de posibles numeros

            do {
                for (int i = 0; i < 6; i++) {  // cuidado hay que hacerlo con el sorteo o numero 6
                    duplicados[i] = aleatorio.nextInt(49) + 1; //desde uno hasta 49


                }
                sorteonumero = Arrays.stream(duplicados).distinct().toArray(); // aqui compruebo numeros iguales, los que son iguales se eliminan, se introducen nuevos hasta que sean diferentes
                System.out.println(Arrays.toString(sorteonumero));
            } while (sorteonumero.length < 6); // si hay menos de seis se vuelve a generar
            Arrays.sort(sorteonumero);
            System.out.println(Arrays.toString(sorteonumero));

            int reintegro = aleatorio.nextInt(10);
            int complementario;
            do {
                 complementario = aleatorio.nextInt(49) + 1;
                repetir = false;
                for (int i = 0; i < sorteonumero.length; i++) {
                    if (sorteonumero[i] == complementario) {
                        repetir = true;
                    }
                }

            }while (repetir == true) ;
            System.out.println("el complementario es:"+complementario);
            System.out.println("el reintegro es: " + reintegro);

        } else {
            System.out.println("saliendo del programa...");
        }


    }
}



