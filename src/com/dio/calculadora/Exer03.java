package com.dio.calculadora;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;
        int count=0;
        int maior=0, aux1=0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            count++;
            aux1+=numero;
            if (numero > maior){
                maior=numero;
            }

        }while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println(aux1);
        System.out.println(aux1/5);
    }
}
