package com.dio.calculadora;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = sc.nextInt();
        double qtd;
        while(n-- > 0){
            int x = sc.nextInt();
            qtd = 1;
            for(int i = 0; i<x; i++)
                qtd *= 2;
            qtd = Math.floor((qtd/12)/1000);
            System.out.printf("%.0f kg\n", qtd);   //Complete o código aqui.
        }
    }
}

