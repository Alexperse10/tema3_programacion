package org.example;

import java.util.Scanner;

public class metodo_matches_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la hora correcta");
        String hora = sc.nextLine();
        if (hora.matches("\\d{2}:\\d{2}")){
            System.out.println("es correcto");
        }else {
            System.out.println("es incorrecto");
        }
    }
}
