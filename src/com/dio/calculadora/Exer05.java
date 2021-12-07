package com.dio.calculadora;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada=0;

        System.out.println("Qual o numedo que vc quer ver da tabuada");
        tabuada = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " * " + i + " = " + (tabuada*i));
        }
    }
}
