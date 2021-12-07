package com.dio.calculadora;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdade = 0, qtdadePar = 0, qtdadeImpar = 0;
        int numero = 0;
        System.out.println("Digite a quantidade de numeros");
        qtdade = scan.nextInt();

        for (int i = 0; i < qtdade; i++) {
            System.out.println("Digite um numero");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                qtdadePar++;
            } else {
                qtdadeImpar++;
            }
        }
        System.out.println("Qauntidade de Par: " + qtdadePar);
        System.out.println("Qauntidade de Impar: " + qtdadeImpar);
    }
}
