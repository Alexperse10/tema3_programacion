package org.example;

import java.util.Random;
import java.util.Scanner;

public class ruleta_clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"rojo", "negro"};
        int numero;
        String[] par_impar = {"par", "impar"};
        String color_usuario;
        String par_impar_usuario;
        Random aleatorio = new Random();
        int numero_par=0;
        int numero_impar=0;
        int contador_numero=0;
        boolean par = false;
        int numero_aleatorio;
        String par_impar_aleatorio= "";
        numero_aleatorio = aleatorio.nextInt(37);
        do {
            System.out.println("introduce un numero");
            numero = sc.nextInt();
            if (numero > 36 || numero < 0) {
                System.out.println("ERROR: numero fuera de los rangos permitidos");
            } else {
                System.out.println("El numero es correcto");
            }
        } while (numero > 36 || numero < 0);

        if (numero_aleatorio == 0 && numero ==0) {
            System.out.println("enhorabuena has ganado");
            return;
        } else {
            sc.nextLine();
            do {
                System.out.println("introduce el color");
                color_usuario = sc.nextLine().toLowerCase();
                if (!color_usuario.equalsIgnoreCase("rojo") && !color_usuario.equalsIgnoreCase("negro")){
                    System.out.println("Error: el color no es correcto");
                }else{
                    System.out.println("el color es correcto");
                }
            }while (!color_usuario.equalsIgnoreCase("rojo") && !color_usuario.equalsIgnoreCase("negro"));

                System.out.println("introduce si es par o impar");
                par_impar_usuario = sc.nextLine();
// el break solo sirve para for, while, do-while, switch
                if (!par_impar_usuario.equalsIgnoreCase("par") && !par_impar_usuario.equalsIgnoreCase("impar")) {
                    System.out.println("el valor es invalido");
                   return;
                }
                String color_aleatorio = color[aleatorio.nextInt(2)];


                if (numero_aleatorio == numero){
                    contador_numero++;
                }
            if (numero_aleatorio%2==0){
                System.out.println("el numero es par");
                numero_par++;
                par_impar_aleatorio = "par";
                par = true;
            }else{
                System.out.println("el numero es impar");
                numero_impar++;
                par_impar_aleatorio = "impar";
                par = false;
            }
            if ((numero_aleatorio == numero) && color_usuario.equalsIgnoreCase(color_aleatorio) && par_impar_usuario.equalsIgnoreCase(par_impar_aleatorio)){
                System.out.println("enhorabuena has ganado");
            } else if (color_usuario.equalsIgnoreCase(color_aleatorio)) {
                System.out.println("has acertado el color es "+color_aleatorio);
                
            }else if (par_impar_aleatorio.equalsIgnoreCase(par_impar_usuario)){
                System.out.println("has acertado es numero "+par_impar_aleatorio);
            } else if (numero == numero_aleatorio) {
                System.out.println("Has acertado el numero");
            }else {
                System.out.println("no has acertado nada");
            }
        }

    }
}
