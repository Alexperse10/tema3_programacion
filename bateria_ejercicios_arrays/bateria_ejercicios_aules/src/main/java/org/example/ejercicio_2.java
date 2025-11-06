package org.example;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // invertido [i]= original[longitud-1-i]

       int [] numero = {8,7,3,5,9,5,4,8};
        int invertido [] = new int[numero.length];
        for (int i =0; i< numero.length; i++){
          System.out.print(numero[i]+ " ");
      }
      for (int i =0; i< numero.length; i++){
           invertido[i] = numero[numero.length-1-i];
      }
      System.out.println();
      for (int i=0; i< numero.length; i++){
          System.out.print(+invertido[i] + " ");
      }
    }
}
