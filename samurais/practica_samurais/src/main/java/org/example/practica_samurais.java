package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_samurais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int contadorjugador1=0;
        int contadorjugador2=0;
        //int []equipo1 = new int[7];
        //int []equipo2 = new int[7];
        //int []vector1 = {4,6,1,3,7,8,1};
        //int []vector2 = {5,6,1,7,8,2,3};
       // String equipo_1 = "1,3,5,5,7,8,2";
       // String equipo_2 = "1,3,5,5,7,8,1";
       // String [] subequipo_1 = equipo_1.split(",");
       // String [] subequipo_2 = equipo_1.split(",");
        boolean repetir1 = false;
        boolean repetir2 = false;
        int [] equiponumero_1 = new int[7];
        int [] equiponumero_2 = new int[7];

        do {
            System.out.println("Equipo 1");
            System.out.println("introduce potencia de los samurais separado por espacios:");
            String equipo1 = sc.nextLine();
            String[] subequipo_1 = equipo1.split(" ");
            System.out.println(Arrays.toString(subequipo_1));
            repetir1 = false;
            int suma1 =0;
            for (int i = 0; i < subequipo_1.length; i++) {
                try {
                    int numero1 = Integer.parseInt(subequipo_1[i]);
                    suma1 += numero1;
                    equiponumero_1[i] = numero1;
                }catch (NumberFormatException error){
                    System.out.println("error introduce solo numeros validos");
                    repetir1 = true;
                    break;
                }
            }
            if (subequipo_1.length !=7) {
                System.out.println("Error. El equipo no tiene 7 samurais.");
                repetir1 = true;
            } else if (suma1 !=30) {
                System.out.println("Error. El equipo no suma 30");
                repetir1= true;
            }else{
                System.out.println("El equipo esta completo");
                //repetir = false;
            }
        }while (repetir1 == true);
        do {
            System.out.println("Equipo 2");
            System.out.println("introduce potentiate de los samurais");
            String equipo_2 = sc.nextLine();
            String[] subequipo_2 = equipo_2.split(" ");
            repetir2 = false;
            int suma2 = 0;
            for (int i = 0; i < subequipo_2.length; i++) {
                try {
                    int numero2 = Integer.parseInt(subequipo_2[i]);
                    suma2 += numero2;
                    equiponumero_2[i] = numero2;
                }catch (NumberFormatException error){
                    System.out.println("error introduce valores validos");
                }
            }if (subequipo_2.length != 7){
                System.out.println("Error. El equipo no tiene 7 samurais");
                repetir2=true;
        }else if (suma2 != 30) {
                System.out.println("Error. La potencia total no suma 30.");
                repetir2 = true;
            } else {
                System.out.println("El equipo esta completo");
                //repetir = false;
            }
        }while (repetir2 == true);

        int inicioguerra = aleatorio.nextInt(7)+1;
        System.out.println("la batalla se inicia con el samurai numero " +inicioguerra);

        for (int i =0; i<7; i++){
            int turno = (inicioguerra -1 + i)%7;
            int samurai_1 = equiponumero_1[turno];
            int samurai_2 = equiponumero_2[turno];

            if (samurai_1>samurai_2){
                System.out.println("Samurai "+(turno+1)+" gana equipo 1 "+samurai_1+" vs "+samurai_2);
                contadorjugador1++;
            } else if (samurai_2>samurai_1) {
                System.out.println("samurai "+(turno+1)+" gana equipo 2 "+samurai_1+" vs "+samurai_2);
                contadorjugador2 ++;

            }else {
                System.out.println("Empaque, los dos samurais caen en batalla");
            }
        }
        if (contadorjugador1>contadorjugador2){
            System.out.println("El equipo 1 ha ganado");
        } else if (contadorjugador1<contadorjugador2) {
            System.out.println("el equipo 2 ha ganado");
        }else{
            System.out.println("Ha habido un empate");
        }

    }
}
