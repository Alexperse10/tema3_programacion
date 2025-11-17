package org.example;

import java.util.Scanner;

public class metodo_matches_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu matricula");
        String matricula = sc.nextLine();
        if (matricula.matches("\\d{4}-[A-Z]{3}")){
            System.out.println("la matricula es correcta");

        }else {
            System.out.println("la matricula es incorrecta");
        }


    }
}
