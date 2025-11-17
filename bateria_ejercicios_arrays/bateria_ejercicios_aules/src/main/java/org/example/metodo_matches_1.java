package org.example;

import java.util.Scanner;

public class metodo_matches_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una fecha (dd/mm/aaa):");
        String fecha = sc.nextLine();

        if (fecha.matches("\\d{1,2}/\\d{1,2}/\\d{4}")){
            System.out.println("formato correcto");
        }
        else{
            System.out.println("formato incorrecto");
        }
    }
}
