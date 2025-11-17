package org.example;

import java.util.Scanner;

public class metodo_matches_2 {
    // numero de telefono
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero de telefono");
        String numero = sc.nextLine();

        if (numero.matches("[6789]\\d{8}")){
            System.out.println("el formato es correcto");
        }else {
            System.out.println("el formato es incorrecto");
        }
    }
}
