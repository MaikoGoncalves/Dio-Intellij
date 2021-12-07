package com.dio.calculadora;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial=0;
        int auxFatorial=1;
        System.out.println("Digite um numero");
        fatorial = scan.nextInt();
        for(int i = 1; i<= fatorial; i++)
        {
            auxFatorial= auxFatorial * i;
        }
        System.out.println("Fatorial de: "+ fatorial+ "! é: "+auxFatorial);
    }
}
