package co.com.EjemploSwitch;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner Teclado =new Scanner(System.in) ;

        int Valor1=0,Valor2=0,Resultado=0,Respuesta=0;

        System.out.println("Ingresa  el Primer numero" );
        Valor1=Teclado.nextInt();

        System.out.println("Ingresa  el Segundo numero" );
        Valor2=Teclado.nextInt();

        System.out.println("Que desea  hacer con estos valores" );
        System.out.println("Ingrese  la opcion que  necesita" );
        System.out.println(" 1 Suma, 2 Resta, 3 Multiplicacion, 4 Division , " );
        Respuesta=Teclado.nextInt();



        switch (Respuesta){


            case 1:Resultado=Valor1+Valor2;
                System.out.println("La suma es igual a " +Resultado );
             break;
            case 2:Resultado=Valor1-Valor2;
                System.out.println("La Resta es igual a " +Resultado );
                break;
            case 3:Resultado=Valor1*Valor2;
                System.out.println("La Multiplicacion  es igual a " +Resultado );
                break;
            case 4:Resultado=Valor1/Valor2;
                System.out.println("La Division  es igual a " +Resultado );
                break;


    }


    }

}