package com.dio.calculadora;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       int nota;
            System.out.println("Digite uma nota");
            nota = scan.nextInt();
        while (nota<0 || nota >10 ){
            System.out.println("Nota invalida digite novamente: ");
               nota = scan.nextInt();
        }
    }
}
